package com.example.compose.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.*
import com.example.compose.R

@Composable
fun LogInScreen() {
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(25.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        iconAnimation()
        Text(
            text = "See what's happening in the world right now",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Column() {
            Button(
                onClick = { /*TODO*/ },
                Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                border = BorderStroke(1.dp, Color(0xff1da1f2)),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "Sign Up With Google", style = TextStyle(Color(0xff1da1f2)))
            }
            Box(modifier = Modifier.height(10.dp))
            Button(
                onClick = { /*TODO*/ },
                Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff1da1f2)),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "Create Account", style = TextStyle(Color.White))
            }
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Already have an account ?", style = TextStyle(Color(0xff1da1f2)))

        }
    }
}

@Composable
fun iconAnimation() {
    val comositeResult : LottieCompositionResult = rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.twitter)
    )
    val progressAnimation by animateLottieCompositionAsState(
        comositeResult.value,
        isPlaying = true,
        iterations = LottieConstants.IterateForever,
        speed = 1.0f
    )
    LottieAnimation(composition = comositeResult.value, progress = progressAnimation)
}
