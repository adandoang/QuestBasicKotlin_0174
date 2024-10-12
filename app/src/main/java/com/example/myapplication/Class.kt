package com.example.myapplication

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "Lara@gmail.com")

    println(contact.email)

    contact.email = "Adan@gmail.com"

    println(contact.email)
}