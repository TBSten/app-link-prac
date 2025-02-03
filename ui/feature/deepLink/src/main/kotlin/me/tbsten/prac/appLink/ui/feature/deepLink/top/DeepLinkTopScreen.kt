package me.tbsten.prac.appLink.ui.feature.deepLink.top

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
internal fun DeepLinkTopScreen(modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text("`/` Native Screen")
        }
    }
}
