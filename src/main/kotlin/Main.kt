package ru.netology

fun main() {

    val amount: Int = 17000

    val discountLite = amount - 100 // скидка 100р
    val discountMedium = amount * 0.95 // скидка 5%
    val discountPremium = 0.99 // доп. скидка 1% для постоянных клиентов

    var accountPremium: Boolean = false

    val totalPrice: Int = if (amount > 1_001 && amount < 10_000) {
        discountLite
    } else if (amount > 10_001) {
        discountMedium.toInt()
    } else {
        amount
    }
    if (accountPremium) {
        println("Ваша покупка на сумму $amount  руб. с учетом скидки и премиум аккаунта составит: " + (totalPrice * discountPremium).toInt() + " руб")
    } else {
        println("Ваша покупка на сумму $amount  руб. с учетом скидки составит: $totalPrice руб.")
    }
}


