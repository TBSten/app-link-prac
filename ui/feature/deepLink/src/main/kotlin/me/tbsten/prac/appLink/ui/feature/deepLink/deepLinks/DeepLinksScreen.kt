package me.tbsten.prac.appLink.ui.feature.deepLink.deepLinks

import android.content.Context
import android.net.Uri
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import me.tbsten.prac.appLink.ui.PreviewRoot

@Composable
internal fun DeepLinksScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Scaffold(modifier = modifier) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            Button(onClick = { showDeepLinksWebPage(context) }) {
                Text("showDeepLinksWebPage")
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

@Preview
@Composable
private fun DeepLinksScreenPreview() = PreviewRoot {
    DeepLinksScreen()
}
