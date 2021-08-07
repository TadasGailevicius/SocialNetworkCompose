package com.tedm.socialnetworkcompose.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import com.tedm.socialnetworkcompose.R
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun StandardTextField(
    text: String = "",
    hint: String = "",
    maxLenght: Int = 40,
    isError: Boolean = false,
    keyboardType: KeyboardType = KeyboardType.Text,
    onValueChange: (String) -> Unit
) {

    val isPasswordToggleDisplayed by remember {
        mutableStateOf(keyboardType == KeyboardType.Password)
    }

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    TextField(
        value = text,
        onValueChange = {
                        if(it.length <= maxLenght) {
                            onValueChange(it)
                        }
        },
        placeholder = {
            Text(
                text = hint,
                style = MaterialTheme.typography.body1
            )
        },
        isError = isError,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        ),
        singleLine = true,
        visualTransformation = if(!isPasswordVisible && isPasswordToggleDisplayed){
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        trailingIcon = {
                       if(isPasswordToggleDisplayed){
                           IconButton(onClick = {
                               isPasswordVisible = !isPasswordVisible
                           }) {
                               Icon(
                                   imageVector = if (isPasswordVisible){
                                       Icons.Filled.VisibilityOff
                                   } else {
                                       Icons.Filled.Visibility
                                   },
                                   contentDescription = if(isPasswordVisible) {
                                       stringResource(id = R.string.password_visible_content_description)
                                   } else {
                                       stringResource(id = R.string.password_hidden_content_description)
                                   }
                               )
                           }
                       }
        },
        modifier = Modifier
            .fillMaxWidth()
            .semantics {
                testTag = "standard_text_field"

            }
    )
}