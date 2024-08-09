package com.example.kotlindersleri.nesne_tabanli

fun main() {
    val sonuc=5 carp 4
    // 5 :this sayi da 4 u temsil ediyo
    println("sonuc: $sonuc")
}
// var olan classları genişletmek demek extensın
infix fun Int.carp(sayi:Int):Int{
    return this*sayi
    // this burada ınt clası

}
