package me.tbsten.prac.appLink.app

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import me.tbsten.prac.appLink.ui.feature.example.Examples
import me.tbsten.prac.appLink.ui.feature.example.examples
import me.tbsten.prac.appLink.ui.navigation.NavControllerWrapper

@Composable
internal fun AppNavHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    val navControllerWrapper = NavControllerWrapper(navController)

    NavHost(navController = navController, startDestination = Examples, modifier = modifier) {
        examples(
            navControllerWrapper = navControllerWrapper,
        )
    }
}
