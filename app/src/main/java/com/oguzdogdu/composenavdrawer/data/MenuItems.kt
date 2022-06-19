package com.oguzdogdu.composenavdrawer.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class MenuItems(
    val icon: ImageVector? = null, val title: String? = null,
    val isDivider: Boolean = false, val isHeader: Boolean = false, val topHeader: Boolean = false
) {
    object TopHeader : MenuItems(title = "Gmail", topHeader = true)

    object AllInboxes : MenuItems(
        icon = Icons.Filled.AllInbox,
        title = "All inboxes"
    )

    object Primary : MenuItems(
        icon = Icons.Filled.Inbox,
        title = "Primary"
    )

    object Social : MenuItems(
        icon = Icons.Filled.Person,
        title = "Social"
    )

    object Promotions : MenuItems(
        icon = Icons.Outlined.Tag,
        title = "Promotions",
    )

    object Starred : MenuItems(
        icon = Icons.Outlined.StarOutline,
        title = "Starred"
    )

    object Snoozed : MenuItems(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    )

    object Important : MenuItems(
        icon = Icons.Outlined.Label,
        title = "Important"
    )

    object Sent : MenuItems(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )

    object Schedule : MenuItems(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled"
    )

    object Outbox : MenuItems(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )

    object Draft : MenuItems(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )

    object AllMail : MenuItems(
        icon = Icons.Outlined.Mail,
        title = "All Mail"
    )

    object Spam : MenuItems(
        icon = Icons.Outlined.ReportGmailerrorred,
        title = "Spam"
    )

    object Calendar : MenuItems(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )

    object Contacts : MenuItems(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )

    object Setting : MenuItems(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )

    object Help : MenuItems(
        icon = Icons.Outlined.Help,
        title = "Help & FeedBack"
    )

    object Divider : MenuItems(
        isDivider = true
    )

    object HeaderOne : MenuItems(
        isHeader = true,
        title = "All labels"
    )

    object HeaderTwo : MenuItems(
        isHeader = true,
        title = "Google apps"
    )
}