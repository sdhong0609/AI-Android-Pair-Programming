package com.sdhong.aiandroidpairprogramming

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DonutDetails(details: String, modifier: Modifier = Modifier) {
    var isExpanded by remember { mutableStateOf(false) }
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Details",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = details,
            maxLines = if (isExpanded) Int.MAX_VALUE else 3,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { isExpanded = !isExpanded }) {
            Text(text = if (isExpanded) "SEE LESS" else "SEE MORE")
        }
    }
}