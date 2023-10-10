package com.neotica.samsara.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.neotica.samsara.R
import com.neotica.samsara.ui.components.SamsaraWheel
import com.neotica.samsara.ui.theme.TransparentDark
import com.neotica.samsara.ui.theme.TransparentWhite

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        SamsaraWheel()
        LazyColumn(
            modifier = Modifier
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.End
        ) {
            item {
                Column(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .background(color = if (isSystemInDarkTheme()) TransparentDark else TransparentWhite),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = stringResource(R.string.title_main),
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = stringResource(R.string.desc_main)
                    )
                    Spacer(modifier = Modifier.padding(12.dp))
                    Button(
                        onClick = {},
                        content = {
                            Text("fds")
                        },
                        modifier = Modifier.padding(24.dp)
                    )
                }
            }
        }
    }
}