package com.example.latihannn

fun contohlist(){
    println ("---LIST---")
    //list read-only
    val readOnlyAbjad = listOf("a","b","c")
    println(readOnlyAbjad)

    //list mutable
    val shape: MutableList<String> = mutableListOf("circle","square","triangle")
    println(shape)

