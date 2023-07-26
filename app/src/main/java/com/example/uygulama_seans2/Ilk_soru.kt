package com.example.uygulama_seans2

fun main() {
    val dikdortgen = Dikdortgen(7.0, 3.0)

    val alan = dikdortgen.alanHesapla()
    val cevre = dikdortgen.cevreHesapla()

    println("Dikdörtgenin Alanı: $alan")
    println("Dikdörtgenin Çevresi: $cevre")
}
