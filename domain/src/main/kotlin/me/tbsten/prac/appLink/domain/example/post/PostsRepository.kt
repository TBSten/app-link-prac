package me.tbsten.prac.appLink.domain.example.post

interface PostsRepository {
    suspend fun getPosts(): List<Post>
}
