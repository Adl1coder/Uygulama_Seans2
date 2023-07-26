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

fun main() {
    // "Otomobil" sınıfından bir nesne oluşturuyoruz
    val otomobil = Otomobil(45, 200.9, 40)

    // "Arac" sınıfının özelliklerini ekrana yazdırıyoruz
    println("Aracın Hızı: ${otomobil.hiz}")
    println("Aracın Yakıt Tüketimi: ${otomobil.yakitTuketimi}")

    // "Otomobil" sınıfının özelliklerini ekrana yazdırıyoruz
    println("Otomobilin Bagaj Hacmi: ${otomobil.bagajHacmi}")

    // "Otomobil" sınıfının metotunu çağırıyoruz ve ekrana yazdırıyoruz
    otomobil.bagajAc()
}
