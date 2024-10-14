package com.jinniy.portfolio.domain.entity

import com.jinniy.portfolio.domain.constant.SkillType
import jakarta.persistence.*

@Entity
class Skill(
    name: String,
    type: String,
    isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id: Long? = null

    var name : String = name

    //valueOf 는 문자열과 일치하는 enum으로 매핑해줌
    @Column(name = "skill_type") //type이 예약어인 경우가 있어서 매핑 따로 해줌
    @Enumerated(value = EnumType.STRING)
    var type: SkillType = SkillType.valueOf(type)

    var isActive: Boolean = isActive
}