package com.example.kotlindersleri.nesne_tabanli

fun main() {
ucretHesapla(konserveBoyut.ORTA,55)
}
fun ucretHesapla(boyut:konserveBoyut,adet:Int){
    when(boyut){
        konserveBoyut.KUCUK -> println("toplam maliyet: ${adet*130}")
        konserveBoyut.ORTA -> println("toplam maliyet: ${adet*210}")

        konserveBoyut.BUYUK -> println("toplam maliyet: ${adet*460}")

    }

}