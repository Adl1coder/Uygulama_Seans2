package com.example.uygulama_seans2

/*Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin.
 Ardından, listedeki sayıları toplayan bir fonksiyon yazın ve sonucu ekrana yazdırın*/
import java.util.Scanner

fun main() {

    val liste = ArrayList<Int>()

    for (i in 1..5) {
        print("Lütfen ${i}. sayıyı girin: ")
        val scanner = Scanner(System.`in`)
        val sayi = scanner.nextInt()
        liste.add(sayi)
    }

    val toplam = toplamiHesapla(liste)
    println("Girilen sayıların toplamı: $toplam")
}

// Integer ArrayList'teki sayıları toplayan fonksiyon
fun toplamiHesapla(sayilar: ArrayList<Int>): Int {
    var toplam = 0
    for (sayi in sayilar) {
        toplam += sayi
    }
    return toplam
}
