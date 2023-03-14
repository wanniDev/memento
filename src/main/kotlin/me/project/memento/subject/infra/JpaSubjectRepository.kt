package me.project.memento.subject.infra

import me.project.memento.subject.domain.Subject
import org.springframework.data.jpa.repository.JpaRepository

interface JpaSubjectRepository: JpaRepository<Subject, Long> {
    fun findSubjectById(id: Long): Subject
}