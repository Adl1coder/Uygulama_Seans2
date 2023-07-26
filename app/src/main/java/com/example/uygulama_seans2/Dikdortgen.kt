package com.example.uygulama_seans2

class Dikdortgen(val uzunluk: Double, val genislik: Double) {
    fun alanHesapla(): Double {
        return uzunluk * genislik
    }

    fun cevreHesapla(): Double {
        return 2 * (uzunluk + genislik)
    }
}
