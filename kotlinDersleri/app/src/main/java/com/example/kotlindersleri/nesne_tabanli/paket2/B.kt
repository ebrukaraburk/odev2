package com.example.kotlindersleri.nesne_tabanli.paket2

import com.example.kotlindersleri.nesne_tabanli.paket1.A
// farklı pakette oldugu için import ettik

class B :A() {// a clasına open yazdık
    fun metod(){
        val a= A()


    }
}