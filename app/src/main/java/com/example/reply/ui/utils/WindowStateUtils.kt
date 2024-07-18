package com.example.reply.ui.utils

//different nav types -> bottom nav, nav rail, permanent drawer
enum class ReplyNavigationType {
    BOTTOM_NAVIGATION,
    NAVIGATION_RAIL,
    PERMANENT_NAVIGATION_DRAWER
}

// for larger screens show list & detail to use up the space
// for the other screens, show list on one screen & details on another screen
enum class ReplyContentType {
    LIST_ONLY,
    LIST_AND_DETAIL,
}