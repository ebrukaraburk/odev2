package com.example.kotlindersleri.standart_programlama

fun main() {
    for(i in 1..3){
        println("dongu1:$i")
    }
    //10 ile 20 arasi 5 er artsın
    for(x in 10..20 step 5){
        println("dongu 2: $x")
    }
    for(x in 20 downTo 10 step 5){
        println("dongu 3: $x")

    }
    var sayac=1
    while(sayac<4){
        println("dongu : $sayac")
        sayac++
    }
    for(i in 1..5){
      if(i==3){
          continue
      }
        println("dongu 4:$i")
    }
    for(i in 1..5){
        if(i==3){
           break
        }
        println("dongu 5:$i")
    }
}