package com.example.myapplication

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    uppercaseString("Hello")
    println({ string: String -> string.uppercase() }("Hello"))
}