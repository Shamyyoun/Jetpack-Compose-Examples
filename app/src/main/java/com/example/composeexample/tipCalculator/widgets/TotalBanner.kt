package com.example.composeexample.tipCalculator.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TotalBanner(
    totalPerPerson: Float = 0f
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color(0x4D673AB7),
        elevation = 0.dp,
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Total Per Person",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            Text(
                text = "$$totalPerPerson",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp
            )
        }
    }
}