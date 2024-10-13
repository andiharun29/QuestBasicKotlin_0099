package com.example.latihannn

// Data class
// Data class adalah class yang digunakan untuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi equels(), hashCode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.


data class DataClass(
    val id: Int,
    var email: String
)


fun main(){
    val data = DataClass(1, "dia@gmail.com")
    println(data)

    // Fungsi Equels
    val data2 = DataClass(1, "kamu@gmail.com")
    println(data == data2) //false

