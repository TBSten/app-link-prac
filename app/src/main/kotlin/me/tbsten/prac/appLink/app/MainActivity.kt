package me.tbsten.prac.appLink.app

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
        val appLinkIntent: Intent = intent
        val appLinkAction: String? = appLinkIntent.action
        val appLinkData: Uri? = appLinkIntent.data

        enableEdgeToEdge()
        setContent {
            AppTheme {
                HandleErrors(applicationErrorStateHolder) {
                    InjectDebugMenu()
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        appLinkData?.let {
                            Text("Action: $appLinkAction")
                            Text("Data: $appLinkData")
                            HorizontalDivider()
                        }
                        Button(onClick = { showDeepLinksWebPage(this@MainActivity) }) {
                            Text("showDeepLinksWebPage")
                        }
                    }
                }
            }
        }
    }
}

private fun showDeepLinksWebPage(context: Context) {
    val url = "https://app-link.prac.tbsten.me/index.html"
    val intent = CustomTabsIntent.Builder()
        .build()
    intent.launchUrl(context, Uri.parse(url))
}
