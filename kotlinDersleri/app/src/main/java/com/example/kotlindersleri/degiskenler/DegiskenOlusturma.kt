package com.example.kotlindersleri.degiskenler

//dosya demek boş bir yapı demek
fun main(){
    // main ana klosor demek  . run a basınca ilk burdan başlar.
    //kt yazıyosa dosyadır.
    //dosya ve klas isimleri buyuk harfle baslar.
    var urunAdi="macbook pro"
    var fiyat=4599
    var boy=1.78
    var harf='A'
    var kontrol=false
    // gri olması kullanılmadıgından
    println("urun adi :$urunAdi")
    println("fiyat :${fiyat*2}")
    println("boy :$boy")
    println("harf: $harf")
    println("kontrol:$kontrol")
    //sarı uyarı anlamı
    //consant sabitler ,swift let,java final
    // tanımladıktan sonra değeri degişmezse val olarak  tanımlanır
    // var yazılırsa sayıyı daha sonra değiştirebilirim demek
    val numara=90
    println(numara)
    // tür dönüşümü -type casting

    //to metodu ile donusum saglanır. textfield veya edittext den kullanıcıdan bilgi alınır
    // girilen bilgi string olmalı en kapsayıcı tür.4 yazarsan ve sayısal bir ifadeyse bunu sayısala donusturmeliyiz
    // ara yuzde birsey gostereceksek bu string olmalı
    // text field de sayısalı stringe cevirmeliyiz ,
    // sayısaldan sayısala donusum
    val i=42
    val d=93.67
    val sonuc1=i.toDouble()
    val sonuc2=d.toInt()
    println(sonuc1)
    println(sonuc2)
    // integerda sadece sonuna 0 ekledi ama 93.67 yi  ondalık kısmını attı
    // yuvarlamaz .
    // sayısaldan metine donusum
    val sonuc3=i.toString()
    //konsolda gorunum olarak bir sey ifade etmez
    val sonuc4=d.toString()
    println(sonuc4)
    println(sonuc3)

//metinden sayısala donusum
    val yazi="78t"
    val sonuc5=yazi.toIntOrNull()
    if(sonuc5!=5){
     println(sonuc5)

    }else {
        println("donusum hatasi ")
    }
    sonuc5?.let{
        println(sonuc5)
    }




}