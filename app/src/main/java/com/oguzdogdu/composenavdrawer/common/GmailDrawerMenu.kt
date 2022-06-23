package com.oguzdogdu.composenavdrawer.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oguzdogdu.composenavdrawer.data.MenuItems
import com.oguzdogdu.composenavdrawer.ui.theme.background


@Composable
fun GmailDrawerMenu() {
    val menuItemList = listOf(
        MenuItems.TopHeader,
        MenuItems.Divider,
        MenuItems.AllInboxes,
        MenuItems.Divider,
        MenuItems.Primary,
        MenuItems.Social,
        MenuItems.Promotions,
        MenuItems.HeaderOne,
        MenuItems.Starred,
        MenuItems.Snoozed,
        MenuItems.Important,
        MenuItems.Sent,
        MenuItems.Schedule,
        MenuItems.Outbox,
        MenuItems.Draft,
        MenuItems.AllMail,
        MenuItems.Spam,
        MenuItems.HeaderTwo,
        MenuItems.Calendar,
        MenuItems.Contacts,
        MenuItems.Divider,
        MenuItems.Setting,
        MenuItems.Help
    )

    LazyColumn(modifier = Modifier.background(background)) {
        items(menuItemList) { item ->
            when {
                item.topHeader -> {
                    Text(
                        text = item.title!!,
                        color = Color.Red,
                        modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Default
                    )
                }
                item.isDivider -> {
                    Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp).background(
                        Color.LightGray))
                }
                item.isHeader -> {
                    Text(
                        text = item.title!!,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = FontFamily.SansSerif,
                        modifier = Modifier.padding(
                            start = 20.dp,
                            top = 20.dp
                        )
                    )
                }
                else -> {
                    MailDrawerItem(item = item)
                }
            }
        }
    }
}

@Composable
fun MailDrawerItem(item: MenuItems) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription = item.title!!,
            modifier = Modifier.weight(0.5f)
        )
        Text(
            text = item.title, fontFamily = FontFamily.Default,
            modifier = Modifier.weight(2.0f)
        )
    }
}