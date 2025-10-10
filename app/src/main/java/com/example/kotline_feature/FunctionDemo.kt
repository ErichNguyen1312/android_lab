package com.example.kotline_feature

fun main(){
//
//    println("Enter name of user order caffe: ")
//    var userDrink = readln();
//
//    makeCoffe(3,userDrink)

    var result = add(3,4);
    println(result)
}

//declare
fun makeCoffe(sugarCount: Int, userDrink: String){
    println("Coffe with $sugarCount spoon  sugar for $userDrink" )

}

fun add (numbera: Int, numberb:Int):Int{
    var sum = numbera + numberb;
    return sum
}
