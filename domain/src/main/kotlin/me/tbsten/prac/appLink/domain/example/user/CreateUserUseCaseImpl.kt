package me.tbsten.prac.appLink.domain.example.user

import javax.inject.Inject

internal class CreateUserUseCaseImpl @Inject constructor(
    private val userRepository: UserRepository,
) : CreateUserUseCase {
    override suspend fun execute(user: User) {
        userRepository.createUser(user)
    }
}
