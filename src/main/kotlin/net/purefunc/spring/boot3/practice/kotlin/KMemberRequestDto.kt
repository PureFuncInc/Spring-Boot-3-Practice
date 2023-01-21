package net.purefunc.spring.boot3.practice.kotlin

import java.time.Instant

data class KMemberRequestDto(

    val name: String,
    val email: String,
) {

    fun toPo(): KMemberPo =
        KMemberPo(
            id = null,
            name = name,
            email = email,
            createDate = Instant.now().toEpochMilli(),
        )
}