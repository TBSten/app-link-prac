package me.tbsten.prac.appLink.domain.example.user

interface GetUsersUseCase {
    suspend fun execute(): List<User>
}
