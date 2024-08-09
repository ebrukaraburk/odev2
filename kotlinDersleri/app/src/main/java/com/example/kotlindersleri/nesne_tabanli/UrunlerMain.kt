package com.example.kotlindersleri.nesne_tabanli

fun main() {
  //nesne olsuturucaz urunler clasından ornek yapmak demek
    val urun1=Urunler(1,"tv",8999)
    // deger erişimi
    println("///////////////////////////")
    println("Id: ${urun1.id}")
    println("Id: ${urun1.ad}")
    println("Id: ${urun1.fiyat} ")

// deger atama yapalım
    urun1.ad="tv samsung"
    urun1.fiyat=1000
    println("Id: ${urun1.id}")
    println("Id: ${urun1.ad}")
    println("Id: ${urun1.fiyat} ")
    urun1.bilgiAl()
    println("///////////////////////////")

    val urun2=Urunler(2,"saat",3000)
    println("Id: ${urun2.id}")
    println("Id: ${urun2.ad}")
    println("Id: ${urun2.fiyat} ")
    urun2.bilgiAl()
}