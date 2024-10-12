package com.example.myapplication

fun nullSafety() {
    var neverNull: String = "This can't be null"

    var nullable: String? = "You k=can keep a null here"
    nullable = null

    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    println(neverNull.length)
    println(nullable?.length)


}
