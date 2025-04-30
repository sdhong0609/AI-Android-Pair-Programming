package com.sdhong.aiandroidpairprogramming

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.sdhong.aiandroidpairprogramming.ui.component.DonutQuantityControl
import org.junit.Rule
import org.junit.Test

class DonutDetailScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun quantityIncreaseWhenClickPlusButton() {
        // Given
        composeTestRule.setContent {
            DonutQuantityControl()
        }

        // When
        composeTestRule.onNodeWithContentDescription("Increase Quantity").performClick()

        // Then
        composeTestRule.onNodeWithText("2").assertExists()
    }

    @Test
    fun quantityDecreaseWhenClickMinusButton() {
        // Given
        composeTestRule.setContent {
            DonutQuantityControl()
        }

        // When
        composeTestRule.onNodeWithContentDescription("Decrease Quantity").performClick()

        // Then
        composeTestRule.onNodeWithText("0").assertExists()
    }

    @Test
    fun quantityNotDecreaseWhenQuantityZeroAndClickMinusButton() {
        // Given
        composeTestRule.setContent {
            DonutQuantityControl()
        }
        // When
        composeTestRule.onNodeWithContentDescription("Decrease Quantity").performClick()
        composeTestRule.onNodeWithContentDescription("Decrease Quantity").performClick()

        // Then
        composeTestRule.onNodeWithText("0").assertExists()
    }

    @Test
    fun expandDetailDescriptionWhenClickSeeMoreButton() {
        // Given
        composeTestRule.setContent {
            DonutDetailScreen()
        }
        //When
        composeTestRule.onNodeWithText("SEE MORE").performClick()

        // Then
        composeTestRule.onNodeWithText("SEE LESS").assertExists()
    }

    @Test
    fun clickAddToCartButton() {
        // Given
        composeTestRule.setContent {
            AddToCartButton { }
        }
        //When
        composeTestRule.onNodeWithText("ADD TO CART").performClick()

        //Then
        composeTestRule.onNodeWithText("ADD TO CART").assertExists()
    }
}