package com.example.kotlindersleri.nesne_tabanli

fun main() {
 var cevap=Odev2()
    var icAciToplami=cevap.icAci(3)
   var aSayisi= cevap.aSayisi("ebrukaraburk")
  var donusum=  cevap.fahrenhiet(40)
  var maas =  cevap.maasHesabi(100)
  var ucret=  cevap.ucretHesapla(60)
   var cevrehesabi= cevap.cevreHesabi(6,8)
    var faktroiyelHesabi=cevap.faktoriyel(4)
    println("girilen kenar sayisina göre ic aci toplami $icAciToplami")
    println("girilen kelimedeki a harfi sayisi: $aSayisi")
    println("girilen derecenin fahrenheit karsiligi: $donusum")
    println("maasiniz : $maas")
    println(" kota miktarina göre odemeniz gereken ucret : $ucret ")
    println("girdiginiz sayinin faktriyeli $faktroiyelHesabi")
  //  println("girilen kenarların cevresi $cevrehesabi")


}