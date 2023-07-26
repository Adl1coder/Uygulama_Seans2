package com.example.uygulama_seans2

import java.util.ArrayList

/*Bir String türünde ArrayList oluşturun ve içine "ahmet", "mehmet", "ayşe",
"feyza", "emir" gibi isimleri ekleyin.
Kullanıcıdan alınan bir indeks numarasına göre listedeki ismi güncelleyen bir fonksiyon yazın.
 Yani kullanıcı, "ahmet" isminin indeksini ve yeni ismi (örn. "ali") girerek
 listedeki "ahmet" ismini "ali" olarak değiştirebilsin.*/
import java.util.*

import java.util.*

import java.util.*

fun main() {

    val ListOfName = arrayListOf("ahmet", "mehmet", "ayşe", "feyza", "emir")

    println("Listedeki isimler: $ListOfName")
    print("Değiştirmek istediğiniz ismin indeksini girin (0-${ListOfName.size - 1}): ")

    // Kullanıcıdan indeks numarasını alıyoruz
    val scanner = Scanner(System.`in`)
    val indeks = scanner.nextInt()

    if (indeks in 0 until ListOfName.size) {
        print("Yeni ismi girin: ")

        // Kullanıcıdan yeni ismi alıyoruz
        val yeniIsim = scanner.next()

        // isimGuncelle fonksiyonunu çağırarak listedeki ilgili ismi güncelliyoruz
        updateName(ListOfName, indeks, yeniIsim)
        println("İsim güncellendi. Yeni liste: $ListOfName")
    } else {
        println("Geçersiz giriş! Lütfen geçerli bir indeks numarası girin.")
    }
}

// Integer ArrayList'teki indeksteki ismi güncelleyen fonksiyon
fun updateName(isimListesi: ArrayList<String>, indeks: Int, yeniIsim: String) {
    isimListesi[indeks] = yeniIsim
}

