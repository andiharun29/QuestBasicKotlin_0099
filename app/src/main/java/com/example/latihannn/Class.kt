package com.example.latihannn

class motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")

    //prints the value of the property: email
    println(contact.email)

    // updates the value of property: email
    contact.email = "jane@gmail.com"

    //print the new value of the property: email
    println(contact.email)
}