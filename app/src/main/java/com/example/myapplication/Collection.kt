package com.example.myapplication

fun ContohList() {
    println("=== List ===")

    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke list mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari list mutable
    shape.remove("Triangle")
    println (shape)

    //Mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

    //list Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun ContohSet() {
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke Set mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari Set mutable
    shape.remove("Circle")
    println (shape)

    //Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

fun ContohMap() {
    println()
    println("=== Map ===")

    //List Read-Only
    val readOnlyShape : Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    //List Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //Menambahkan data ke list mutable
    shape["Rectangle"] = 4
    println(shape)

    //Menghapus data dari list mutable
    shape.remove("Circle")
    println (shape)

    //list Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}

fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}
