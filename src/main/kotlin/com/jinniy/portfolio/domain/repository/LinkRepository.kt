package com.jinniy.portfolio.domain.repository

import com.jinniy.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>