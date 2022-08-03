package com.example.composeexample.tipCalculator.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun FormCard(
    billAmount: Float = 0f,
    onBillChanged: (Float) -> Unit = {},
    personsCount: Int = 0,
    onPersonsCountChange: (Int) -> Unit = {},
    tipPercent: Float = 0f,
    onTipPercentChange: (Float) -> Unit = {},
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.White,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = billAmount.takeIf { it != 0f }?.toString().orEmpty(),
                onValueChange = {
                    onBillChanged.invoke(it.toFloatOrNull() ?: 0f)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            SplitBill(
                personsCount = personsCount,
                onPersonsCountChange = onPersonsCountChange
            )

            Spacer(modifier = Modifier.height(16.dp))

            Tip(
                tip = billAmount.times(tipPercent)
            )

            Spacer(modifier = Modifier.height(16.dp))

            TipSlider(
                tipPercent = tipPercent,
                onTipPercentChange = onTipPercentChange
            )
        }
    }
}