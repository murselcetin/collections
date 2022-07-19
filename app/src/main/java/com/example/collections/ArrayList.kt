package com.example.collections

fun main() {
    val kisilerListesi = ArrayList<String>()

    //Arrayliste nasıl veri eklenir?

    kisilerListesi.add("Ahmet") //Listemizin 0 indeksli itemi
    kisilerListesi.add("Ayşe") //Listemizin 1 indeksli itemi
    kisilerListesi.add("Ali") //Listemizin 2 indeksli itemi

    //Arraylistte nasıl veri güncellenir?

    println(kisilerListesi)
    kisilerListesi[2] = "Veli"
    println(kisilerListesi)

    kisilerListesi.add(1,"Fatma")
    println(kisilerListesi)

    //Arraylistteki veriler nasıl okunur?
    println(kisilerListesi.get(0))
    println(kisilerListesi[1])

    //Arraylist boyutu nasıl öğrenilir?
    println("Boyut : ${kisilerListesi.size}")
    println("Boyut : ${kisilerListesi.count()}")

    //Arraylist veri kontrol işlemleri nasıl yapılır?
    println("Boş kontrol : ${kisilerListesi.isEmpty()}")
    println("İçeriyor mu : ${kisilerListesi.contains("Ali")}")

    //Arraylist verileri ters çevirme
    kisilerListesi.reverse()
    println(kisilerListesi)

    //Arraylistte sıralama nasıl yapılır?
    kisilerListesi.sort()
    println(kisilerListesi)

    //Arraylistte döngü kullanımı
    for (kisi in kisilerListesi){
        println("Sonuç : $kisi")
    }

    for ((indeks,meyve) in kisilerListesi.withIndex()){
        println("$indeks. -> : $meyve")
    }

    //Arraylistten veri nasıl silinir?
    kisilerListesi.removeAt(1)
    println(kisilerListesi)

    //Arraylistteki tüm veriler nasıl silinir?
    kisilerListesi.clear()
    println(kisilerListesi)
}