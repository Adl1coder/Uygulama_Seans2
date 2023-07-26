package com.example.uygulama_seans2
// Arac sınıfı (üst sınıf)
open class Arac(val hiz: Int, val yakitTuketimi: Double) {
    // Arac özellikleri: hız ve yakıt tüketimi
}

// Otomobil sınıfı (alt sınıf), Arac sınıfından kalıtım alıyor
class Otomobil(hiz: Int, yakitTuketimi: Double, val bagajHacmi: Int) : Arac(hiz, yakitTuketimi) {
    // Otomobil özellikleri: bagajHacmi

    // Bagajı açan metot
    fun bagajAc() {
        println("Bagaj açıldı.")
    }
}


