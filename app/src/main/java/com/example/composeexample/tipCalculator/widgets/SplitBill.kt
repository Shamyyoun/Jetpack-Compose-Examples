package com.example.composeexample.tipCalculator.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun SplitBill(
    personsCount: Int = 1,
    onPersonsCountChange: (Int) -> Unit = {}
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Split",
            fontSize = 16.sp,
            modifier = Modifier.weight(0.5f)
        )

        Row(
            modifier = Modifier.weight(0.5f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {
                onPersonsCountChange.invoke(personsCount + 1)
            }) {
                Text(text = "+")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = personsCount.toString(),
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = {
                val newPersonsCount = personsCount.minus(1).takeIf { it > 0 } ?: 0
                onPersonsCountChange.invoke(newPersonsCount)
            }) {
                Text(text = "-")
            }
        }
    }
}