package com.training.shoppinglist

fun main() {
    val shoppingList = listOf("Processor", "RAM", "Graphics card", "SSD")
    val mutableShoppingList = shoppingList.toMutableList()

    mutableShoppingList.addAll(listOf("Lithium battery", "Cooling system"))

    println("List of items needed: $mutableShoppingList")

    mutableShoppingList.add(2, "OLED panel")

    println("New list is now $mutableShoppingList")

    mutableShoppingList.set(4, "OLED panel")
    mutableShoppingList.removeAt(2)
    mutableShoppingList.add("SSD")

    println("The list is now $mutableShoppingList")

    val item = "Silicon seals"
    if (mutableShoppingList.contains(item)) {
        println("No silicon seals needed.")
    } else {
        mutableShoppingList.add(item)
        println("Silicon seals added to the list.")
    }

    println("The items now in the list are:")
    for (itemInList in mutableShoppingList){
        println(itemInList)
    }
}