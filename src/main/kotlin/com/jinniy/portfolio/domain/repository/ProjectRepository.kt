package com.jinniy.portfolio.domain.repository

import com.jinniy.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>