package com.example.myapplication

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "Adan@gmail.com")
    println(data)

    val data2 = DataClass(1, "Lara@gmail.com")
    println(data == data2)

    val data3 = data.copy()
    println(data3)

    val data4 = data.copy(email = "Yazidun@gmail.com")
    println(data4)
}