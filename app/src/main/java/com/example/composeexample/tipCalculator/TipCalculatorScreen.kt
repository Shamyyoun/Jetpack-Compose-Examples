package com.example.composeexample.tipCalculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeexample.tipCalculator.widgets.FormCard
import com.example.composeexample.tipCalculator.widgets.TotalBanner

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun TipCalculatorScreen() {
    var billAmount by remember { mutableStateOf(0f) }
    var personsCount by remember { mutableStateOf(1) }
    var tipPercent by remember { mutableStateOf(0f) }

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            TotalBanner(
                totalPerPerson = calculateTotalPerPerson(
                    billAmount = billAmount,
                    personsCount = personsCount,
                    tipPercent = tipPercent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            FormCard(
                billAmount = billAmount,
                onBillChanged = {
                    billAmount = it
                },
                personsCount = personsCount,
                onPersonsCountChange = {
                    personsCount = it
                },
                tipPercent = tipPercent,
                onTipPercentChange = {
                    tipPercent = it
                }
            )
        }
    }
}

private fun calculateTotalPerPerson(
    billAmount: Float,
    personsCount: Int,
    tipPercent: Float
): Float {
    return billAmount
        .times(1 - tipPercent)
        .div(personsCount)
}