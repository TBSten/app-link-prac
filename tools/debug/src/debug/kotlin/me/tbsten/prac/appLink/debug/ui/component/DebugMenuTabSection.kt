package me.tbsten.prac.appLink.debug.ui.component

import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.tbsten.prac.appLink.debug.ui.DebugMenuTab
import me.tbsten.prac.appLink.debug.ui.DebugMenuUiAction
import me.tbsten.prac.appLink.debug.ui.DebugMenuUiState
import me.tbsten.prac.appLink.ui.Dispatch
import me.tbsten.prac.appLink.ui.PreviewRoot
import me.tbsten.prac.appLink.ui.error.handleUiEvent

@Composable
internal fun DebugMenuTabSection(
    uiState: DebugMenuUiState,
    dispatch: Dispatch<DebugMenuUiAction>,
    modifier: Modifier = Modifier,
) {
    ScrollableTabRow(
        selectedTabIndex = uiState.selectedTabIndex,
        edgePadding = 0.dp,
        modifier = modifier,
    ) {
        uiState.debugMenuTabs.forEachIndexed { index, debugMenu ->
            Tab(
                selected = uiState.selectedTabIndex == index,
                onClick = handleUiEvent { dispatch(DebugMenuUiAction.SelectTab(index)) },
                text = {
                    Text(debugMenu.tabText)
                },
            )
        }
    }
}

@Preview
@Composable
private fun DebugMenuTabSectionPreview() = PreviewRoot {
    DebugMenuTabSection(
        uiState = DebugMenuUiState(DebugMenuTab.SampleDebugMenuTab),
        dispatch = {},
    )
}
