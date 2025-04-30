package com.sdhong.aiandroidpairprogramming

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddToCartButton(modifier: Modifier = Modifier, onAddToCartClicked: () -> Unit) {
    Button(
        onClick = { onAddToCartClicked() },
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "ADD TO CART")
    }
}