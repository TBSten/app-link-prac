package me.tbsten.prac.appLink.ui.feature.deepLink.test1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
internal fun DeepLinkTest1Screen(modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text("`/test1` Native Screen")
        }
    }
}
