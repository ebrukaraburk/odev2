package com.example.kotlindersleri.nesne_tabanli

 open class Odev2 {


    fun icAci(kenarSayisi:Int):Int{
        val sonuc=(kenarSayisi-2)*180
        return sonuc
    }


    fun maasHesabi(gunSayisi:Int):Int{
        val standartSaat=8
        val standartSaatUcreti=10.0
        val mesaiSaatUcreti=20.0
        val mesaiSaatSiniri=160
        val toplamCalismaSaati=gunSayisi*standartSaat
       var maas=0
        if(toplamCalismaSaati>mesaiSaatSiniri){

          maas=(((toplamCalismaSaati-mesaiSaatSiniri)*mesaiSaatUcreti)+(mesaiSaatSiniri*standartSaatUcreti)).toInt()
            return  maas
        }else{
            maas=(toplamCalismaSaati*standartSaatUcreti).toInt()
            return maas
        }
}


     fun ucretHesapla(kota:Int):Int{
        val kotaLimiti=50
         val kotaUcreti=100
         val asimUcreti=4
         var ucret=0
         if(kota>kotaLimiti)
         {
             ucret=(kota-kotaLimiti)*4+kotaUcreti
             return ucret
         }else{
             ucret=kotaUcreti
             return ucret
         }


     }


     fun fahrenhiet(derece:Int):Double{
         val fahrenhietHesabi=(derece*1.8)+32
         return fahrenhietHesabi

     }
     fun cevreHesabi(kenar1:Int,kenar2:Int){
         val cevre=2*(kenar1+kenar2)
         println("cevre : $cevre")

     }
     fun faktoriyel(sayi:Int):Int{
         var sonuc=1
         for(i in 1..sayi){
             sonuc=i*sonuc

         }
         return sonuc
     }
     fun aSayisi(kelime:String):Int{
         var sonuc=0
         for(i in kelime){
             if(i=='a'){
                 sonuc++
             }
         }
         return sonuc
     }




 }