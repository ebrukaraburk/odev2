package com.example.kotlindersleri.nesne_tabanli

class Fonksiyonlar {
    var mesaj:String?=null
  lateinit  var yazi:String //lateinit var ile kullanılır yazıyı daha sonra tanımlıycam demek
  // lateintler intlerde ve doubllarda kulanılmaz ilk degere 0 vermeliyiz
   var sayi=0




    // void :geri donus degeri olmayan

    fun selamla1(){
        // parantez dısardan bilgi alır
        val sonuc= "merhaba Ahmet"
        yazi="merhaba"
        println(sonuc)
    }
    // returnlu : geri donus degeri olan

    fun selamla2() :String{
        // parantez dısardan bilgi alır
        val sonuc= "merhaba Ahmet"
        return  sonuc
    }
    // parametre
    fun selamla3(isim :String){
        val sonuc= "merhaba $isim"
        println(sonuc)
    }
    // overloading : aynı fonsiyonu
    fun carp(sayi1:Int,sayi2:Int){
        println("carpma :${sayi1*sayi2}")

    }
    fun carp(sayi1:Double,sayi2:Double){
        println("carpma :${sayi1*sayi2}")

    }
    fun carp(sayi1:Int,sayi2:Int,isim:String){
        println("carpma :${sayi1*sayi2}-işlem yapan:$isim")

    }

}