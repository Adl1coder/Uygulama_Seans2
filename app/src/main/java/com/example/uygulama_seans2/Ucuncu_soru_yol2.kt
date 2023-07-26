package com.example.uygulama_seans2

fun SesliHarflerYoket(girdi: String): String {
    return girdi.filter { it !in "aeiouAEIOU" }
}
fun main() {
    val metin = "Merhaba Dünya! Bu bir örnek cümle."
    val sonuc = SesliHarflerİYokEt(metin)

    println("Sesli harfler çıkarıldıktan sonra metin: $sonuc")
}

