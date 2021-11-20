package com.tedm.socialnetworkcompose.core.presentation.util

import com.tedm.socialnetworkcompose.core.util.Event
import com.tedm.socialnetworkcompose.core.util.UiText

sealed class UiEvent: Event() {
    data class ShowSnackbar(val uiText: UiText) : UiEvent()
    data class Navigate(val route: String) : UiEvent()
    object NavigateUp : UiEvent()
    object OnLogin: UiEvent()
}