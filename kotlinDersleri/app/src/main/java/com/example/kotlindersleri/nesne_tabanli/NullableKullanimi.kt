package com.example.kotlindersleri.nesne_tabanli

fun main() {
    //nullable ,null safety ,optional(swift)
    // bir değişkenin null olup olmadıgı ile ilgili
    // bir degisken uygulama calısırken null olunca uygulama kapanır
    var mesaj:String?=null
    // ilk başta deger vermek istemezsek olur
  //mesaj="merhaba"
    // soru işareti sorun yoksa çalıstırrır varsa null yazar

    // yontem 1:
    println("yontem 1:  ${mesaj?.uppercase()}")
    // yontem 2:
   // println("yontem 1:  ${mesaj!!.uppercase()}")

// ünlem sorun olmıycak  guvenıyorum demek
    // yontem 3:
    if(mesaj !=null){
        println("yontem 3:  ${mesaj.uppercase()}")

    }
    else{
        println("yontem3 : sonuc :null")

    }
    // yontem 4:
    mesaj?.let {
        // mesaj null değilse bunu yapar
        println("yontem 4:  ${it.uppercase()}")
    }


}