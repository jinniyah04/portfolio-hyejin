package com.jinniy.portfolio.domain.entity

import jakarta.persistence.*
import org.apache.catalina.Host

@Entity
class Introduction(
            content: String,
            isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduction_id")
    var id: Long? = null

    var content: String = content

    var isActive: Boolean = isActive



}