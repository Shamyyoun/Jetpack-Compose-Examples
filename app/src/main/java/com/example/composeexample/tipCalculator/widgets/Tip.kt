package com.example.composeexample.tipCalculator.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Tip(
    tip: Float = 0f
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Tip",
            fontSize = 16.sp,
            modifier = Modifier.weight(0.5f)
        )

        Text(
            text = "$$tip",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(0.5f)
        )
    }
}