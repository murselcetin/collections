package com.example.collections

fun main() {
    //Hashmap nasıl tanımlanır?
    val iller = HashMap<Int, String>()

    //Hashmape nasıl veri eklenir?
    iller.put(26, "ESKİŞEHİR")
    iller.put(34, "İSTANBUL")
    iller[6] = "ANKARA"
    println(iller)

    //Hashmapte veriler nasıl okunur?
    println(iller[16])
    println(iller.get(34))

    //Hashmapte nasıl veri güncellenir?
    iller.put(26, "ESK")
    println(iller)

    //Hashmap veri kontrol işlemleri nasıl yapılır?
    println(iller.size)
    println(iller.isEmpty())

    //Hashmapte döngü kullanımı
    for ((anahtar, deger) in iller) {
        println("$anahtar -> $deger")
    }

    //Hashmapten veri nasıl silinir?
    iller.remove(34)
    println(iller)

    //Hashmapteki tüm veriler nasıl silinir?
    iller.clear()
    println(iller)
}