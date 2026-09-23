package com.example.lpdm_avaliacao_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lpdm_avaliacao_1.ui.theme.LPDMavaliacao1Theme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.lpdm_avaliacao_1.R.drawable.imagemm
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Web


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LPDMavaliacao1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        mensagem = "Hi there!!",
                        mensagemB = "I'm Assucena Costa Belarmino dos Reis",
                        mensagemC = "Software Developer",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier, mensagem: String, mensagemB: String, mensagemC: String, ) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFFD1DC)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(35.dp))

        Image(
            painter = painterResource(imagemm),
            contentDescription = null,
            modifier = Modifier.size(120.dp)
        )
        Text(
            mensagem,
            fontSize = 50.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            mensagemB,
            fontSize = 35.sp,
            textAlign = TextAlign.Center
        )
        Text(
            mensagemC,
            fontSize = 25.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(35.dp))

        Text(
            text = "Hi, I am currently a software engineer at Google. I have 10 years of professional experience.",
            fontSize = 25.sp ,
            textAlign = TextAlign.Center
            )

        Spacer(modifier = Modifier.height(50.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                tint = Color(0xFF006D3B)

            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "assucenacostab@gmail.com")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,
                tint = Color(0xFF006D3B)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "+55 35 99889-9763")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Web,
                contentDescription = null,
                tint = Color(0xFF006D3B)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = "assucenacosta-b/github.com")
        }

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LPDMavaliacao1Theme {
        Greeting("Android")
    }
}

@Composable
fun Greeting(x0: String) {
    TODO("Not yet implemented")
}