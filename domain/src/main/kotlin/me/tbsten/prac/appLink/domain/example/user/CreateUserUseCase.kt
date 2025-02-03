package me.tbsten.prac.appLink.domain.example.user

interface CreateUserUseCase {
    suspend fun execute(user: User)
}
