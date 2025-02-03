package me.tbsten.prac.appLink.ui.feature.example.localDbUserList

import me.tbsten.prac.appLink.domain.example.user.User

internal sealed interface ExampleLocalDbUserListUiState {
    data object InitialLoading : ExampleLocalDbUserListUiState
    data class Success(
        val users: List<User>,
    ) : ExampleLocalDbUserListUiState
}
