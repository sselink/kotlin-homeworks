package com.example.kotlindersleri.nesne_tabanli_programlama

class Odev2 {
    fun soru1(derece:Double) : Double{
        return derece * 1.8 + 32
    }

    fun soru2(a:Double, b:Double):Double{
        return 2 * (a + b)
    }

    fun soru3(sayi:Int):Int{
        var sonuc = 1
        for(i in 1..sayi){
            sonuc *= i
        }
        return sonuc
    }

    fun soru4(kelime:String):Int{
        var count = 0
        for(harf in kelime){
            if(harf == 'a' || harf == 'A')
                count += 1
        }
        return count
    }

    fun soru5(kenar:Int):Int{
        return (kenar - 2) * 180
    }

    fun soru6(gun:Int):Int{
        val saatlikUcret = 10
        val mesaiUcreti = 20
        val toplamSaat = gun * 8

        val normalSaat = 160
        val mesaiSaat = toplamSaat - 160

        return if(toplamSaat <= 160){
            toplamSaat * saatlikUcret
        }else{
            (normalSaat * saatlikUcret) + (mesaiSaat * mesaiUcreti)
        }
    }

    fun soru7(gb:Int):Int{
        val sabitUcret = 100
        val kota = 50
        val asimUcreti = 4
        val asimMiktari = gb - kota

        return if(gb <= kota){
            sabitUcret
        }else{
            sabitUcret + (asimMiktari * asimUcreti)
        }
    }
}
