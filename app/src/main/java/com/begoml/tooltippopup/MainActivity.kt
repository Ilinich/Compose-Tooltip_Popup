package com.begoml.tooltippopup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.begoml.tooltippopup.tooltip.TooltipContent
import com.begoml.tooltippopup.ui.theme.ComposeTooltipPopupTheme
import com.begoml.tooltippopup.ui.theme.Gray15

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTooltipPopupTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Gray15) {
                    val horizontalPadding = 24.dp

                    val descriptionLarge = "Hello it i: Tooltips text with long long long description text"
                    val descriptionMedium = "Tooltips text with description"
                    val descriptionShort = "Tooltips text"


                    Column(Modifier.fillMaxSize()) {
                        Column(
                            modifier = Modifier
                                .padding(top = 32.dp)
                                .padding(horizontal = 16.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color.White),
                        ) {
                            TooltipContent(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 24.dp)
                                    .padding(horizontal = horizontalPadding),
                                name = "Title 1",
                                value = "value",
                                tooltipsText = descriptionShort,
                            )

                            TooltipContent(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 24.dp)
                                    .padding(horizontal = horizontalPadding),
                                name = "Description Medium",
                                value = "value",
                                tooltipsText = descriptionMedium,
                            )

                            TooltipContent(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 16.dp, bottom = 24.dp)
                                    .padding(horizontal = horizontalPadding),
                                name = "Description Large",
                                value = "Tooltips text value",
                                tooltipsText = descriptionLarge,
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        Column(
                            modifier = Modifier
                                .padding(top = 32.dp, bottom = 24.dp)
                                .padding(horizontal = 16.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color.White),
                        ) {
                            TooltipContent(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 24.dp)
                                    .padding(horizontal = horizontalPadding),
                                name = "tooltip bottom 1",
                                value = "value",
                                tooltipsText = descriptionMedium,
                            )

                            TooltipContent(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 16.dp, bottom = 24.dp)
                                    .padding(horizontal = horizontalPadding),
                                name = "tooltip bottom 2",
                                value = "value",
                                tooltipsText = descriptionShort,
                            )
                        }
                    }
                }
            }
        }
    }
}
