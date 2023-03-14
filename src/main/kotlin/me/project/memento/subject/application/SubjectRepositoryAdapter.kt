package me.project.memento.subject.application

import me.project.memento.subject.domain.Subject
import me.project.memento.subject.domain.SubjectRepository
import me.project.memento.subject.infra.JpaSubjectRepository
import org.springframework.stereotype.Component

@Component
class SubjectRepositoryAdapter(private val jpaSubjectRepository: JpaSubjectRepository): SubjectRepository {
    override fun findById(subjectId: Long): Subject {
        return jpaSubjectRepository.findSubjectById(subjectId)
    }

    override fun findAll(): List<Subject> {
        return jpaSubjectRepository.findAll()
    }
}