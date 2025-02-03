package me.tbsten.prac.appLink.ui.error

import android.annotation.SuppressLint
import androidx.compose.runtime.compositionLocalOf
import me.tbsten.prac.appLink.error.ErrorStateHolder

@SuppressLint("ComposeCompositionLocalUsage")
val LocalErrorStateHolder = compositionLocalOf<ErrorStateHolder> {
    error("ErrorStateHolder is not provided.")
}
