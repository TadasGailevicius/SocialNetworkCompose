package com.tedm.socialnetworkcompose.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.tedm.socialnetworkcompose.domain.models.BottomNavItem
import com.tedm.socialnetworkcompose.presentation.components.components_view_models.StandardScaffoldViewModel

@Composable
fun StandardScaffold(
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: StandardScaffoldViewModel = hiltViewModel(),
    bottomNavItems: List<BottomNavItem> = listOf(),
    content: @Composable () -> Unit
) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = MaterialTheme.colors.surface,
                cutoutShape = CircleShape,
                elevation = 5.dp,
            ) {
                BottomNavigation() {

                    bottomNavItems.forEachIndexed { i, bottomNavItem ->
                        StandardBottomNavItem(
                            icon = bottomNavItem.icon,
                            contentDescription = bottomNavItem.contentDescription,
                            selected = viewModel.selectedBottomNavItem.value == i,
                            alertCount = bottomNavItem.alertCount,
                        ) {
                            viewModel.setSelectedBottomNavItem(i)
                            navController.navigate(bottomNavItems[i].route)
                        }
                    }
                }
            }
        },
        modifier = modifier
    ) {
        content()
    }
}