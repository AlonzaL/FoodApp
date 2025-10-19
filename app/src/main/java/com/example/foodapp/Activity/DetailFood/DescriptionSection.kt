package com.example.foodapp.Activity.DetailFood

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.R

@Composable
fun DescriptionSection(
    descrioption: String
) {
    Column {
        Text(
            text = "Details",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.black),
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )

        Text(
            text = descrioption,
            fontSize = 16.sp,
            color = colorResource(R.color.black),
            modifier = Modifier
                .padding(16.dp)
        )

        Text(
            text = "Byy 2 item for free delivery",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.black),
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
    }
}