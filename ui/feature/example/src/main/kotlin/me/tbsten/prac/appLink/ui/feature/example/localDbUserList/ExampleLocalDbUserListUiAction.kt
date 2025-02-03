package me.tbsten.prac.appLink.ui.feature.example.localDbUserList

import me.tbsten.prac.appLink.domain.example.user.User

sealed interface ExampleLocalDbUserListUiAction {
    data object OnAddUser : ExampleLocalDbUserListUiAction
    data class OnDeleteUser(val user: User) : ExampleLocalDbUserListUiAction
}
