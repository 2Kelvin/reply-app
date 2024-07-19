package com.example.reply.test

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.reply.ui.ReplyApp
import com.example.reply.R
import org.junit.Rule
import org.junit.Test

class ReplyAppTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    // compact screens => bottom nav bar check
    @Test
    @TestCompactWidth
    fun compactDevice_verifyUsingBottomNavigation() {
        // setting up compact window (phone)
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Compact
            )
        }
        // checking for bottom nav bar is there using its contentDescription string
        composeTestRule.onNodeWithTagForStringId(R.string.navigation_bottom).assertExists()
    }

    // medium screens => nav rail check
    @Test
    @TestMediumWidth
    fun mediumDevice_verifyUsingNavigationRail() {
        // setting up medium window (foldable)
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Medium
            )
        }
        // checking if nav rail is there using its contentDescription string
        composeTestRule.onNodeWithTagForStringId(R.string.navigation_rail).assertExists()
    }

    // expanded screens => permanent nav drawer check
    @Test
    @TestExpandedWidth
    fun expandedDevice_verifyUsingNavigationDrawer() {
        // setting up expanded window (tablets)
        composeTestRule.setContent {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Expanded
            )
        }
        // checking if permanent nav drawer is there using its contentDescription string
        composeTestRule.onNodeWithTagForStringId(R.string.navigation_drawer).assertExists()
    }
}