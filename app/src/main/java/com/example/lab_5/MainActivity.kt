package com.example.lab_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab_5.ui.theme.Lab_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab_5Theme {
                MyApp()
            }
        }
    }
}
@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home_screen") {
        composable("home_screen") {
            HomeScreen(navController)
        }
        composable("screen1") {
            Bai1()
        }
        composable("screen2") {
            Bai2()
        }
        composable("screen3") {
            Bai3()
        }
    }
}
@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(onClick = {
                navController.navigate("screen1")
            }) {
                Text("Bài 1")
            }
            Button(onClick = {
                navController.navigate("screen2")
            }) {
                Text("Bài 2")
            }
            Button(onClick = {
                navController.navigate("screen3")
            }) {
                Text("Bài 3")
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab_5Theme {

    }
}