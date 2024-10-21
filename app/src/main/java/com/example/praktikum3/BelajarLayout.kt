package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.praktikum3.R

@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        HeaderSection2()
        DetailMhs(
            param = "Nama",
            argu = "Putri Habibah Devina Maharani"
        )
        DetailMhs(param = "Nim", argu = "20220140109")
    }
}

@Composable
fun HeaderSection2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth() //biar rownya kesamping
                .padding(16.dp)
        ) {
            Box{
                Image(
                    painter = painterResource(id = R.drawable.logo_ti_umy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape), //supaya gambar jadi bentuk lingkaran

                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp) //ukuran icon
                        .align(androidx.compose.ui.Alignment.BottomEnd) //icon ada dibagian bawah kanan gambar

                )
            }
            Column (
                modifier = Modifier.padding(10.dp)
            )
            {
                Text(text = "Teknologi Informasi") //text berada di dalam column supaya letaknya sebaris
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun DetailMhs(
    param: String, argu:String
){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
                modifier = Modifier.weight(0.8f)) //memberi ruang kepada elemen
            Text(text = ": ",
                modifier = Modifier.weight(0.2f))
            Text(text = argu,
                modifier = Modifier.weight(2f))
        }
    }
}