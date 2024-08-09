package com.example.kotlindersleri.nesne_tabanli

class Urunler (var id:Int,var ad:String ,var fiyat :Int){
init {
    //constructor
    //bu sınıftan nesne olsuturuldugunda çalısır.
    println("nesne olusturuldu")

}


    fun bilgiAl(){
    println("Id: ${id}")
    println("Id: ${ad}")
    println("Id: ${fiyat} ")
    // this bulundugu sınıfı temsil eder swiftt de selftir
    // super :kalıtım yoluyla gelen ust sınıfı temsil eder

}
}