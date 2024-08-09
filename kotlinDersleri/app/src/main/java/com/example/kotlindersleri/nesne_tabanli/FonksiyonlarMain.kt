package com.example.kotlindersleri.nesne_tabanli

fun main() {
    val f=Fonksiyonlar()
    f.selamla1()
    // unit void oludugu anlamına geliyor
    val gelenSonuc=f.selamla2()
    println("gelen sonuc: $gelenSonuc")
    // burada veri iletimi var
    f.selamla3("zeynep")
    f.carp(10,20,"merve")

}