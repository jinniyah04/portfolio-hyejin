package com.jinniy.portfolio.domain.entity

import jakarta.persistence.*
import java.time.LocalDate
import javax.swing.text.StyledEditorKit.BoldAction

@Entity
class Achievement(
          title: String
        , description: String
        , achievement: LocalDate?
        , host: String
        , isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null

    var title: String = title

    var description : String = description

    var achievement : LocalDate? = achievement

    var host: String = host

    var isActive: Boolean = isActive


}
