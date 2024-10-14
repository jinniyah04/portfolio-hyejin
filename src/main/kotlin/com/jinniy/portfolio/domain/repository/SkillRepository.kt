package com.jinniy.portfolio.domain.repository

import com.jinniy.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>