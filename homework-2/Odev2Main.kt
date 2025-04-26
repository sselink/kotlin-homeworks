package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val a = Odev2()

    println("------------Soru 1------------")
    val fahrenheit = a.soru1(25.0)
    println("Fahrenheit : $fahrenheit")

    println("------------Soru 2------------")
    val cevre = a.soru2(5.0, 6.5)
    println("Cevre : $cevre")

    println("------------Soru 3------------")
    val faktoriyel = a.soru3(5)
    println("Faktoriyel : $faktoriyel")

    println("------------Soru 4------------")
    val kelime = "Adana"
    val aSayisi = a.soru4(kelime)
    println("A sayisi : $aSayisi")

    println("------------Soru 5------------")
    val kenar = 4
    val toplamAci = a.soru5(kenar)
    println("$kenar kenarli cokgenin ic acilar toplami : $toplamAci")

    println("------------Soru 6------------")
    val gun = 21
    val maas = a.soru6(gun)
    println("$gun gun calisan iscinin maasi : $maas TL")

    println("------------Soru 7------------")
    val gb = 102
    val ucret = a.soru7(gb)
    println("$gb GB kullanim icin faturaniz $ucret TL'dir.")
}


