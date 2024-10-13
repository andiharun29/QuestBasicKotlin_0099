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

    //list read-only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//set adalah kumpulan data yang tidak dimiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
//set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat  di uabh
//set Read Only menggunakan setOf
//set mutbale menggunakan mutableSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    //set read-only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //set mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Squere", "Triangle")
    println(shape)

    //menambahkan data ke dalam set mutable
    shape.add("RectangLe")
    println(shape)

    //menghapus data dari set mutable
    shape.remove("circle")
    println(shape)

    //set Read-Only
    val shapesLocked:Set<String> = shape
    println(shapesLocked)
}

