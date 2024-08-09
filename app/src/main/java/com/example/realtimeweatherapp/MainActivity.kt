package com.example.realtimeweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.realtimeweatherapp.ui.theme.RealTimeWeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val weatherViewModel=ViewModelProvider(this)[WeatherViewModel::class.java]
        setContent {
            RealTimeWeatherAppTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color=MaterialTheme.colorScheme.background)
                {
                    WeatherPage(weatherViewModel)
                }
            }
        }
    }
}

