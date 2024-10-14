package com.jinniy.portfolio.domain.entity

import jakarta.persistence.*
import jakarta.servlet.http.HttpServletRequest
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request

@Entity
class HttpInterface(
        httpServletRequest: HttpServletRequest
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null

    var cookies: String? = httpServletRequest.cookies
            ?.map { "${it.name}:${it.value}" }
            ?.toString()

    var referer: String? = httpServletRequest.getHeader("referer")

    var localAddr: String? = httpServletRequest.localAddr

    var remotAddr: String? = httpServletRequest.remoteAddr

    var remoteHost: String? = httpServletRequest.remoteHost

    var requestUri: String? = httpServletRequest.requestURI

    var userAent: String? = httpServletRequest.getHeader("user-age")


}