package com.example.apiapplication.Screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.apiapplication.view.ServiceItem
import com.example.apiapplication.viewModel.AllServiceViewModel
import java.net.URLEncoder

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    val viewModel: AllServiceViewModel = viewModel()
    val items = viewModel.liveDataAllService

    Scaffold(
        topBar = { TopAppBar(title = { Text("All Service") }) }
    ) { paddingValues ->
        LazyColumn(contentPadding = paddingValues) {
            itemsIndexed(items) { _, item ->
                ServiceItem(items = item) {
                    val encodedProfileImage = URLEncoder.encode(item.customer?.profileImage ?: "", "UTF-8")
                    navController.navigate(
                        "DetailsScreen/${item.customer?.username ?: "Unknown"}/${item.customer?.email ?: "Unknown"}/" +
                                "${item.customer?.mobile ?: "Unknown"}/$encodedProfileImage"
                    )
                }
            }
        }
    }


    LaunchedEffect(Unit) {
        viewModel.getAllService()
    }
}
