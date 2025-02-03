package me.tbsten.prac.appLink.domain.example.user

interface DeleteUserUseCase {
    suspend fun execute(user: User)
}
