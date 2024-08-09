package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas=19
    val isim="ahmet"
    if(yas>=18){
        println("resitsiniz")
    }else{
        println("reresit değilsiniz")
    }
if(isim=="ahmet"){
    println("merhaba ahmet")

}
else{
    println("tanınmayan kisi")
}
val ka="admin"
val s=123456
    if(ka=="admin"&& s==123456){
       println("hosgeldiniz")

    }
    else{
        println("hatali giris")

    }
    val sayi=11
    if(sayi==10 || sayi==20){
        println("sayi 10 veya 20dir")
    }else
    {
        println("sayi 10 veya 20 değildir")
    }
    //switch e benzer çoklu tercih
    val numara=1
    when(numara){
        1-> println("sayi:1")
        2-> println("sayi:2")
        3-> println("sayi :3")
        else-> println("boyle bir sayi yok")


    }

}