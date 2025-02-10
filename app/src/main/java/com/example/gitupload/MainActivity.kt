package com.example.gitupload

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gitupload.ui.theme.GitUploadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GitUploadTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.spacedBy(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(10.dp)

    ) {
        NameCard()
        ContactInfo(modifier)
    }


}

@Composable
private fun ColumnScope.NameCard() {
    Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = stringResource(R.string.android_logo_description),
        contentScale = ContentScale.Inside,

        alpha = 0.5F
    )
    Text(
        text = stringResource(R.string.name_text),
        fontSize = 36.sp,
        modifier = Modifier
            .padding(top = 16.dp)
            .padding(end = 16.dp)
            .align(alignment = Alignment.CenterHorizontally)

    )
    Text(
        text = stringResource(R.string.comp_sci_student),
        fontSize = 18.sp,
        modifier = Modifier
            .padding(top = 16.dp)
            .padding(end = 16.dp)
            .align(alignment = Alignment.CenterHorizontally)

    )
}

@Composable
private fun ContactInfo(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = stringResource(R.string.phone),

            )
            Text(
                text = stringResource(R.string.phone_number),
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .padding(end = 16.dp)

            )
        }
        Row {
            Icon(
                Icons.Rounded.AccountCircle,
                contentDescription = stringResource(R.string.social),

                )
            Text(
                text = stringResource(R.string.social_name),
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .padding(end = 16.dp)

            )
        }
        Row {
            Icon(
                Icons.Rounded.MailOutline,
                contentDescription = stringResource(R.string.mail),

                )
            Text(
                text = stringResource(R.string.email),
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .padding(end = 16.dp)

            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GitUploadTheme {
        BusinessCard("Android")
    }
}