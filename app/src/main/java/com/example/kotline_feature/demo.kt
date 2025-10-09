package com.example.kotline_feature


fun  main(){
    println("Rock paper scissors: ")
    var playerChoice = ""
    var computerChoice = ""

    println("Enter you choice: ")
    playerChoice= readln()

    val randomNumber = (1..3).random()

//    if(randomNumber == 1) {
//        computerChoice = "Rock"
//    } else if(randomNumber ==2){
//        computerChoice = "Paper"
//    }else{
//        computerChoice = "Scissors"
//    }

    //using when statement
    when (randomNumber) {
        1-> computerChoice = "Rock"
        2-> computerChoice = "Paper"
        3-> computerChoice = "Scissors"

    }

    //find out winner
//    var winner = when{
//        playerChoice == computerChoice ->"Tie"
//        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
//        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
//        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
//        else -> "Computer"
//    }

    //using when Expression

    var winner =when{
        playerChoice == computerChoice ->"Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }


    println("Player choice: "+playerChoice)
    println("Computer choice: "+computerChoice)

    println(winner + " Winner")

}