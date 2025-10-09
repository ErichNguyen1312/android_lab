package com.example.kotline_feature

import kotlin.reflect.typeOf


fun  main(){
    println("Demo kotlin")

    var age : Int =0;

    println("Khai bao do tuoi: ")
    age = readln().toInt()

    // in keyword
    if( age in  18.. 39) {
        println("You can go in")
    }else if(age >=40){
        println("You are too old")
    }
    else {
        println("You can't go in")
    }

    //declare variables
    //val: read only, var: mutable
//    val popcorn =5;
//    val hotdogs =7;
//
//    var customer =10;
//
//    //its value can be reassigned after declaration
//    customer = 8;
//
//    println(customer)
//
//    println("There are $customer customer")
//
//    println("There are ${customer+1} customer")
//
//    //collections
//
//    println("Collections")
//    // read only list
//    val listReadOnly = listOf("1","2","3","4")
//    println(listReadOnly)
//    println(listReadOnly.first())
//    println(listReadOnly.last())
//
//    println(listReadOnly.count());
//
//    println("check number 6 in list "+ "6" in listReadOnly )

//    val  circleRatio = 3.1415926535F
//    println(circleRatio)

//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
//    val boolNull: Boolean? = null

//    println(myTrue && myTrue)
//
//
//    var name : String = "Demo"
//    name = "Setting up your Java environment"
//
//    println(name.length)
}