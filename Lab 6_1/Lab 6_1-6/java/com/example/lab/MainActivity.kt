package com.example.lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Tip data class
data class Tip(val title: String, val description: String, val imageRes: Int)

// Sample data
val tips = listOf(
    Tip("Spend 15 minutes outdoors", "Take a walk or have a meeting while strolling.", R.drawable.one),
    Tip("Listen to a new podcast", "Try a podcast or audiobook to unwind.", R.drawable.two),
    Tip("Meditate for 3 minutes", "Take a brief moment to clear your mind.", R.drawable.three),
    Tip("Drink 8 glasses of water", "Stay hydrated throughout the day for better health.", R.drawable.four),
    Tip("Read 10 pages of a book", "Take some time to read and relax.", R.drawable.five)
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                TipList(tips)
            }
        }
    }
}

// Composable to display a single Tip item
@Composable
fun TipItem(tip: Tip) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { expanded = !expanded },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column {
            Image(
                painter = painterResource(tip.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = tip.title,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(16.dp)
            )
            if (expanded) {
                Text(
                    text = tip.description,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
                )
            }
        }
    }
}

// Composable to display a list of tips
@Composable
fun TipList(tips: List<Tip>) {
    LazyColumn {
        items(tips) { tip ->
            TipItem(tip)
        }
    }
}

// Preview function for the TipItem composable
@Preview(showBackground = true)
@Composable
fun TipItemPreview() {
    MaterialTheme {
        TipItem(Tip("Spend 15 minutes outdoors", "Take a walk or have a meeting while strolling.", R.drawable.one))
    }
}

// Preview function for the TipList composable
@Preview(showBackground = true)
@Composable
fun TipListPreview() {
    MaterialTheme {
        TipList(tips)
    }
}
