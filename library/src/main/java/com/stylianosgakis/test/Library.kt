package com.stylianosgakis.test

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LibraryComposable(modifier: Modifier = Modifier) {
  Box(modifier = modifier.fillMaxSize(), propagateMinConstraints = true) {
    Column {
      Text(text = "Hello World #1!")
      Card {
        Text(text = "Some card#1", Modifier.padding(32.dp))
      }
      Text(text = "Hello World #2!")
      Text(text = "Hello World #3!")
      Text(text = "Hello World #4!")
      Text(text = "Hello World #5!")
      Card {
        Text(text = "Some card#2", Modifier.padding(32.dp))
      }
      Text(text = "Hello World #6!")
      Text(text = "Hello World #7!")
      Text(text = "Hello World #8!")
      Text(text = "Hello World #9!")
    }
  }
}

@Preview
@Composable
fun PreviewLibraryComposable() {
  LibraryComposable()
}
