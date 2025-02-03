package me.tbsten.prac.appLink.ui.feature.example.counter

internal sealed interface ExampleCounterUiAction {
    data object Refresh : ExampleCounterUiAction
}
