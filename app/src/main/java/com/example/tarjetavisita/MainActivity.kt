package com.example.tarjetavisita

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetavisita.ui.theme.TarjetaVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TarjetaVisitaApp()
                }
            }
        }
    }
}

@Composable
fun TarjetaVisitaApp() {

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color(7, 48, 66)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_android),
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
            Text(text = stringResource(R.string.nombreCompleto),color = Color.White, fontSize = 50.sp)
            Text(text = stringResource(R.string.descripcion),color = Color(50, 222, 132))
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 500.dp)
            .padding(bottom = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row(modifier = Modifier.height(1.dp).fillMaxWidth().background(color = Color.White)){}
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(start = 40.dp)
                .padding(bottom = 10.dp)
            ){
            Icon(painter = painterResource(id = R.drawable.baseline_phone_24), contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = stringResource(R.string.telefono), modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
        Row(modifier = Modifier.height(1.dp).fillMaxWidth().background(color = Color.White)){}
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(start = 40.dp)
                .padding(bottom = 10.dp)
        ){
            Icon(painter = painterResource(id = R.drawable.baseline_share_24), contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = stringResource(R.string.social), modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
        Row(modifier = Modifier.height(1.dp).fillMaxWidth().background(color = Color.White)){}
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(start = 40.dp)
                .padding(bottom = 10.dp)
        ){
            Icon(painter = painterResource(id = R.drawable.baseline_email_24), contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = stringResource(R.string.email), modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TarjetaVisitaTheme {
        TarjetaVisitaApp()
    }
}