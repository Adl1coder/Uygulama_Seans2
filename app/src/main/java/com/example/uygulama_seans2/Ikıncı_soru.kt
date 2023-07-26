package com.example.uygulama_seans2

fun main() {
    // "Otomobil" sınıfından  nesne oluşturma
    val otomobil = Otomobil(45, 200.9, 40)

    // "Arac" sınıfının özelliklerini ekrana yazdırıyoruz
    println("Aracın Hızı: ${otomobil.hiz}")
    println("Aracın Yakıt Tüketimi: ${otomobil.yakitTuketimi}")

    // "Otomobil" sınıfının özellikleri
    println("Otomobilin Bagaj Hacmi: ${otomobil.bagajHacmi}")

    // "Otomobil" sınıfının metotunu çağırıyoruz ve ekrana yazdırıyoruz
    otomobil.bagajAc()
}