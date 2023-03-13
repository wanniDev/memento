package me.project.memento.subject.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class Subject(
    val name: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    var createTime: LocalDateTime? = null
    var updateTime: LocalDateTime? = null
    var deleteTime: LocalDateTime? = null

}