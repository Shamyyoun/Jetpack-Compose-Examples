package com.example.composeexample.moneyCalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeexample.components.CircleButton

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun MoneyCalculatorScreen() {
    var moneyCounter by remember {
        mutableStateOf(0)
    }

    Surface(
        color = Color(0xA60020D5),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "$$moneyCounter",
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(62.dp))

            CircleButton(
                text = "Tap",
                onClick = {
                    moneyCounter += 1
                }
            )

            if (moneyCounter > 25) {
                Text(
                    text = "Great! Alot of money :)",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic
                    )
                )
            }
        }
    }
}