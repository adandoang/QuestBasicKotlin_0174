package com.example.myapplication

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

fun withDefaultParameter(name: String = "Adan", age: Int) {
    println()
    println("== wtihDefaultParameter ==")
    println("Hello, $name You are $age Years old.")
}

fun withReturn(panjang : Int, lebar : Int) {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("Lara")
    withNamedArgument(name = "Lara", age = 21)
    withDefaultParameter(age = 21)
}