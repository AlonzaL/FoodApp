package com.example.foodapp.Activity.DetailFood

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.Domain.FoodModel
import com.example.foodapp.Helper.previewFood
import com.example.foodapp.R


@Composable
fun RowDetail(
    item: FoodModel = previewFood,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .height(45.dp)
            .fillMaxWidth()
            .background(
                color = colorResource(R.color.white),
                shape = RoundedCornerShape(50.dp)
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.time_color),
            contentDescription = null
        )

        Text(
            text = "${item.TimeValue} min",
            modifier = Modifier
                .padding(start = 8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = colorResource(R.color.darkPurple)
        )
        Spacer(modifier = Modifier.width(48.dp))

        Image(
            painter = painterResource(R.drawable.star),
            contentDescription = null
        )

        Text(
            text = "${item.Star}",
            modifier = Modifier
                .padding(start = 8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = colorResource(R.color.darkPurple)
        )
        Spacer(modifier = Modifier.width(48.dp))

        Image(
            painter = painterResource(R.drawable.flame),
            contentDescription = null
        )

        Text(
            text = "${item.Calorie}",
            modifier = Modifier
                .padding(start = 8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            color = colorResource(R.color.darkPurple)
        )
    }
}