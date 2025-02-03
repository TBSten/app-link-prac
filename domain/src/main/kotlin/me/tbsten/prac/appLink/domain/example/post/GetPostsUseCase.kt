package me.tbsten.prac.appLink.domain.example.post

interface GetPostsUseCase {
    suspend fun execute(): List<Post>
}
