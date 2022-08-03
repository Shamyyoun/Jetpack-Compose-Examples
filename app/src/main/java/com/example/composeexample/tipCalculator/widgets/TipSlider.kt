package com.example.composeexample.tipCalculator.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TipSlider(
    tipPercent: Float = 0f,
    onTipPercentChange: (Float) -> Unit = {}
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "${tipPercent.times(100)} %",
            fontSize = 16.sp
        )

        Slider(
            valueRange = 0f..1f,
            value = tipPercent,
            onValueChange = onTipPercentChange
        )
    }
}