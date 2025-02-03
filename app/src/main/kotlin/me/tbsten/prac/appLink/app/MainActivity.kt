package me.tbsten.prac.appLink.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import me.tbsten.prac.appLink.debug.ui.InjectDebugMenu
import me.tbsten.prac.appLink.error.ApplicationErrorStateHolder
import me.tbsten.prac.appLink.ui.designSystem.AppTheme
import me.tbsten.prac.appLink.ui.error.HandleErrors

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var applicationErrorStateHolder: ApplicationErrorStateHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handleDeepLink()

        enableEdgeToEdge()
        setContent {
            AppTheme {
                HandleErrors(applicationErrorStateHolder) {
                    InjectDebugMenu()
                    AppNavHost()
                }
            }
        }
    }

    private fun handleDeepLink() {
        val appLinkIntent: Intent = intent
        val appLinkAction: String? = appLinkIntent.action
        val appLinkData: Uri? = appLinkIntent.data
        println(
            """
                intent: $appLinkIntent
                action: $appLinkAction
                data: $appLinkData
            """.trimIndent()
        )
        Toast.makeText(this, "DeepLink !", Toast.LENGTH_SHORT).show()
    }
}
