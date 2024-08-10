package com.example.realtimeweatherapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.realtimeweatherapp.R

val AbrilFatface = FontFamily(
    Font(R.font.abrilfatface_regular)
)
val Cabin_Sketch= FontFamily(
    Font(R.font.cabinsketch_bold,FontWeight.Bold),
    Font(R.font.cabinsketch_regular,FontWeight.Normal)
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Cabin_Sketch,
        fontWeight = FontWeight.Normal,
    ),
    bodyMedium = TextStyle(
        fontFamily = Cabin_Sketch,
        fontWeight = FontWeight.Bold,
    ),
    bodySmall = TextStyle(
        fontFamily = AbrilFatface,
        fontWeight = FontWeight.SemiBold
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)