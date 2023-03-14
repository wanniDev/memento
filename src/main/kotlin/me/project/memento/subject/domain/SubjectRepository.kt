package me.project.memento.subject.domain

import org.springframework.data.jpa.repository.JpaRepository

interface SubjectRepository {
    fun findById(subjectId: Long): Subject

    fun findAll(): List<Subject>
}