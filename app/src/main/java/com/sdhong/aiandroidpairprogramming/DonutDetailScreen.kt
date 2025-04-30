package com.sdhong.aiandroidpairprogramming

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdhong.aiandroidpairprogramming.ui.component.DonutQuantityControl

@Composable
fun DonutDetailScreen(modifier: Modifier = Modifier) {
    val donutInfo = DonutInfoData("Donut", "A tag line", "$2.99")
    val donutDetails =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempus, sem vitae convallis imperdiet, lectus nunc pharetra diam, ac rhoncus quam eros eu risus. Nulla pulvinar condimentum erat, pulvinar tempus turpis bla..."
    val donutIngredients = "Vanilla, Almond Flour, Eggs, Butter, Cream,"
    Column(modifier = modifier) {
        DonutImage()
        DonutInfo(donutInfo = donutInfo)
        DonutDetails(details = donutDetails)
        DonutIngredients(ingredients = donutIngredients)
        Spacer(modifier = Modifier.height(16.dp))
        DonutQuantityControl()
        AddToCartButton(onAddToCartClicked = {
            // TODO: Add to cart logic
        })
    }
}