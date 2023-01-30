package com.begoml.tooltippopup.tooltip

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.begoml.tooltippopup.R
import com.begoml.tooltippopup.ui.theme.Gray45

@Composable
fun TooltipContent(
    modifier: Modifier,
    tooltipsText: String,
    name: String,
    value: String,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Tooltip(
            modifier = Modifier
                .weight(1f)
                .padding(end = 4.dp),
            name = name,
            tooltip = tooltipsText,
        )

        Text(
            text = value,
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight.Bold,
            ),
        )
    }
}

@Composable
private fun Tooltip(
    modifier: Modifier,
    name: String,
    tooltip: String,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier.weight(weight = 1f, fill = false),
            text = name,
            maxLines = 1,
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight.Medium,
            ),
            color = Gray45,
            overflow = TextOverflow.Ellipsis,
        )
        TooltipPopup(
            modifier = Modifier
                .padding(start = 8.dp),
            requesterView = { modifier ->
                Icon(
                    modifier = modifier,
                    painter = painterResource(id = R.drawable.ic_info),
                    contentDescription = "TooltipPopup",
                    tint = Gray45,
                )
            },
            tooltipContent = {
                Text(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .padding(vertical = 8.dp),
                    text = tooltip,
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight.Medium,
                    ),
                    color = Color.White,
                )
            }
        )
    }
}
