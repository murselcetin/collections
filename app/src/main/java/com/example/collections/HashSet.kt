package com.example.collections

fun main() {
    //Hashset nasıl tanımlanır?
    val takimlar = HashSet<String>()

    //Hashsete nasıl veri eklenir?

    takimlar.add("Fenerbahçe")
    takimlar.add("Galatasaray")
    takimlar.add("Beşiktaş")
    println(takimlar)

    //Hashsette veriler nasıl okunur?
    println(takimlar.elementAt(1))

    //Hashset veri kontrol işlemleri nasıl yapılır?
    println(takimlar.size)
    println(takimlar.isEmpty())

    //Hashsette döngü kullanımı
    for ((i,m) in takimlar.withIndex()){
        println("$i. ->  $m")
    }

    //Arraylistten veri nasıl silinir?
    takimlar.remove("Elma")
    println(takimlar)

    //Arraylistteki tüm veriler nasıl silinir?
    takimlar.clear()
    println(takimlar)
}