package com.example.composeexample.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun CircleButton(
    text: String = "",
    onClick: () -> Unit = {}
) {
    Card(
        shape = CircleShape,
        elevation = 8.dp,
        modifier = Modifier
            .size(100.dp)
            .clickable { onClick.invoke() }
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                fontSize = 16.sp
            )
        }
    }
}