package me.tbsten.prac.appLink.domain.example.user

interface UserRepository {
    suspend fun getUsers(): List<User>
    suspend fun createUser(vararg users: User)
    suspend fun deleteUser(vararg users: User)
}
