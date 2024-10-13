package com.example.latihannn

fun contohlist(){
    println ("---LIST---")
    //list read-only
    val readOnlyAbjad = listOf("a","b","c")
    println(readOnlyAbjad)

    //list mutable
    val shape: MutableList<String> = mutableListOf("circle","square","triangle")
    println(shape)

    //menambahkan data ke dalam list mutable
    shape.add("circle")
    println(shape)

    //menghapus data dari list mutable
    shape.remove("triangle")

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    // mengubah data di dalam list mutable
    shape[0] = "Oval"
    println(shape)

