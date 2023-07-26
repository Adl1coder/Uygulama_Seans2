package com.example.uygulama_seans2
// Kullanıcıdan alınan bir string içindeki tüm sesli harfleri kaldıran fonksiyon
fun SesliHarflerİYokEt(metin: String): String {
    // Sesli harfleri içeren bir string
    val sesliHarfler = "aeiouAEIOU"

    // Sonuç stringini oluşturmak için StringBuilder kullanıyoruz
    val sonucStringBuilder = StringBuilder()

    // Girdi stringindeki her bir karakteri dolaşan bir for döngüsü
    for (karakter in metin) {
        // Eğer karakter sesli harfler içinde değilse, sonuç stringine ekle
        if (karakter !in sesliHarfler) {
            sonucStringBuilder.append(karakter)
        }
    }

    // Sonuç stringini döndür
    return sonucStringBuilder.toString()
}

fun main() {
    // Kullanıcıdan alınan metin
    val kullaniciGirdisi = "Merhaba Dünya! Bu bir örnek cümle."

    // Kullanıcıdan alınan metindeki sesli harfler çıkarılarak yeni bir metin oluştur
    val sonucMetin = SesliHarflerİYokEt(kullaniciGirdisi)

    // Sonucu ekrana yazdır
    println("Sesli harfler çıkarıldıktan sonra metin: $sonucMetin")
}

