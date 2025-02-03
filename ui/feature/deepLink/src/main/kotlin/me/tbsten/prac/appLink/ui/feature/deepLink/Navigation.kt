package me.tbsten.prac.appLink.ui.feature.deepLink

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navDeepLink
import kotlinx.serialization.Serializable
import me.tbsten.prac.appLink.ui.feature.deepLink.deepLinks.DeepLinksScreen
import me.tbsten.prac.appLink.ui.feature.deepLink.test1.DeepLinkTest1Screen
import me.tbsten.prac.appLink.ui.feature.deepLink.top.DeepLinkTopScreen
import me.tbsten.prac.appLink.ui.navigation.Navigation
import me.tbsten.prac.appLink.ui.navigation.Screen
import me.tbsten.prac.appLink.ui.navigation.composable
import me.tbsten.prac.appLink.ui.navigation.navigation

@Serializable
data object DeepLinkNav : Navigation

@Serializable
data object DeepLinks : Screen

@Serializable
data object Top : Screen

@Serializable
data object Test1 : Screen

fun NavGraphBuilder.deepLinks() {
    navigation<DeepLinkNav>(startDestination = DeepLinks) {
        composable<DeepLinks> {
            DeepLinksScreen()
        }
        composable<Top>(
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "https://app-link.prac.tbsten.me/"
                }
            )
        ) {
            DeepLinkTopScreen()
        }

        composable<Test1>(
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "https://app-link.prac.tbsten.me/test1"
                }
            )
        ) {
            DeepLinkTest1Screen()
        }
    }
}
