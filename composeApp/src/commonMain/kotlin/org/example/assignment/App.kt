package org.example.assignment

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import profileassignment.composeapp.generated.resources.Res
import profileassignment.composeapp.generated.resources.compose_multiplatform
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontFamily
import profileassignment.composeapp.generated.resources.arroe_left
import profileassignment.composeapp.generated.resources.arrow_right
import profileassignment.composeapp.generated.resources.car
import profileassignment.composeapp.generated.resources.edit_2

@Composable
@Preview
fun App() {
    MaterialTheme {
        ProfileScreen()
    }
}
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(horizontal = 16.dp, vertical = 20.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy (10.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))

        // Top Bar
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(painter = painterResource(Res.drawable.arroe_left), contentDescription = "Back", tint = Color.White)
            Spacer(modifier = Modifier.width(16.dp))
            Text("Profile", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(Modifier.weight(1f))
            Text("support", color = Color.White, modifier = Modifier
                .border(1.dp, Color.Gray, RoundedCornerShape(20.dp))
                .padding(horizontal = 12.dp, vertical = 6.dp))
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Profile info
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(Res.drawable.compose_multiplatform), // Replace with your image
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text("andaz Kumar", color = Color.White, fontWeight = FontWeight.Bold)
                Text("member since Dec, 2020", color = Color.Gray, fontSize = 12.sp)
            }
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier.size(40.dp).border(
                    width = 0.4.dp,
                    shape = CircleShape,
                    color = Color.White,
                ),
                contentAlignment = Alignment.Center
            ){
                Icon(painter = painterResource(Res.drawable.edit_2), contentDescription = null, tint = Color.White , modifier = Modifier.size(18.dp).clip(CircleShape))
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // CRED garage
        Card (
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            ),
            modifier = Modifier.fillMaxSize().background(Color.Black),
            shape = RoundedCornerShape(12.dp),
            border = BorderStroke(width = 0.4.dp, color = White, )

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)
            ) {
                Box(
                    modifier = Modifier.size(40.dp).border(
                        width = 0.4.dp,
                        shape = CircleShape,
                        color = Color.White,
                    ),
                    contentAlignment = Alignment.Center
                ){
                    Icon(painter = painterResource(Res.drawable.car), contentDescription = null, tint = Color.White , modifier = Modifier.size(18.dp).clip(CircleShape))
                }

                Spacer(modifier = Modifier.width(12.dp))
                Column {
                    Text("get to know your vehicles, inside out", color = Color.White, fontSize = 14.sp)
                    Text("CRED garage ", color = Color.White, fontSize = 13.sp)
                }

                Spacer(Modifier.weight(1f))
                Icon(painterResource(Res.drawable.arrow_right), contentDescription = null, tint = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Info Rows
        ProfileInfoRow("credit score", "757", refresh = true)

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(), thickness = 1.dp, color = Color.Gray
        )

        ProfileInfoRow("lifetime cashback", "₹3")

        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(), thickness = 1.dp, color = Color.Gray
        )

        ProfileInfoRow("bank balance", "check")

        Spacer(modifier = Modifier.height(32.dp))

        Text("YOUR REWARDS & BENEFITS", color = Color.Gray, fontSize = 15.sp,)

        Row (
            modifier = Modifier.fillMaxWidth().height(45.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            , verticalAlignment = Alignment.CenterVertically
        ){
            Column {
                Text(text = "cashback balance",color = Color.White, fontSize = 14.sp)
                Text("0.0", color = Color.White, fontSize = 12.sp)

            }

            Icon(painterResource(Res.drawable.arrow_right), contentDescription = null, tint = Color.White)
        }



        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(), thickness = 1.dp, color = Color.Gray
        )

        Row (
            modifier = Modifier.fillMaxWidth().height(45.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            , verticalAlignment = Alignment.CenterVertically
        ){
            Column {
                Text(text = "coins",color = Color.White, fontSize = 14.sp)
                Text("26,46,583", color = Color.White, fontSize = 12.sp)

            }

            Icon(painterResource(Res.drawable.arrow_right), contentDescription = null, tint = Color.White)
        }
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(), thickness = 1.dp, color = Color.Gray
        )


        Row (
            modifier = Modifier.fillMaxWidth().height(45.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            , verticalAlignment = Alignment.CenterVertically
        ){
            Column {
                Text(text = "win upto Rs 1000",color = Color.White, fontSize = 14.sp)
                Text("refer and earn", color = Color.White, fontSize = 12.sp)

            }

            Icon(painterResource(Res.drawable.arrow_right), contentDescription = null, tint = Color.White)
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text("TRANSACTIONS & SUPPORT", color = Color.Gray, fontSize = 12.sp)

        ProfileInfoRow("all transactions", "", isArrowVisible = true)
        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
fun ProfileInfoRow(title: String, value: String, refresh: Boolean = false, isArrowVisible: Boolean = true) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(title, color = Color.White, fontSize = 14.sp)
        if (refresh) {
            Text(" • REFRESH AVAILABLE", color = Color.Green, fontSize = 12.sp)
        }
        Spacer(Modifier.weight(1f))
        if (value.isNotEmpty()) {
            Text(value, color = Color.White, fontSize = 14.sp)
        }
        if (isArrowVisible) {
            Icon(painterResource(Res.drawable.arrow_right), contentDescription = null, tint = Color.White)
        }
    }
}
