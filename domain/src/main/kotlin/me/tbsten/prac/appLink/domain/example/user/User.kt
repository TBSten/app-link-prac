package me.tbsten.prac.appLink.domain.example.user

data class User(
    val uid: UserId,
    val name: String?,
)

@JvmInline
value class UserId(val value: Int)
