package com.sdhong.aiandroidpairprogramming.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdhong.aiandroidpairprogramming.DonutQuantityViewModel

@Composable
fun DonutQuantityControl(
    modifier: Modifier = Modifier,
    viewModel: DonutQuantityViewModel = viewModel()
) {
    val quantity by viewModel.quantity.collectAsState()

    Row(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { viewModel.decreaseQuantity() }) {
            Icon(Icons.Filled.Delete, contentDescription = "Decrease Quantity")
        }
        Text(text = "$quantity", style = MaterialTheme.typography.bodyLarge)
        IconButton(onClick = { viewModel.increaseQuantity() }) {
            Icon(Icons.Filled.Add, contentDescription = "Increase Quantity")
        }
    }
}