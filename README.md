## **Kotlin: Collection Operatörler**

Collections, genellikle aynı türden nesneler içeren yapılardır. Collections içerisinde bulunan nesnelere elements veya items denir. Collections, nesneleri gezmek için kullanılan Iterable arayüzünü kalıtım eder. Collections, üzerinde sıralama, filtreleme vb. pek çok işlem gerçekleştirebileceğimiz operatörler bulundurur. Bu sayede daha az kod yazarak zamandan tasarruf ederiz ve hata yapma şansımız azalır.

Collections, salt okunur özelliğe sahiptir. Mutable collections ise hem yazılabilir hem okunabilir özelliğe sahiptir. Yani mutable collections üzerinde ekleme, güncelleme, silme gibi işlemler yapabiliriz.

List: İçerisinde bulunan her elemanın bir indeksi bulunur. Bu indeks üzerinden elemana erişilebilir. İndeks numarası 0’dan başlar. Liste içinde her elemandan birden fazla bulunabilir yani tekrarlanabilir.

List’in collection hali yani salt okunur hali listOf’tur. Mutable collections hali yani yazılabilir ve okunabilir halleri ise ArrayList, arrayListOf ve mutableListOf’tur.

![This is an image](https://miro.medium.com/max/278/1*XOSJp_9lRcjwqKLN06eXjw.png)

Set: İçerisinde bulunan elemanlar rasgele şekilde yerleştirilir. Elemanlar arasında karışıklık olmaması için her elemandan yalnızca 1 tane bulunabilir yani tekrarlanamaz. Tombala oyunundaki sayıların torbaya konulması sete örnek verilebilir.

Set’in collection hali yani salt okunur hali setOf’tur. Mutable collections hali yani yazılabilir ve okunabilir halleri ise hashSetOf ve mutableSetOf’tur.

![This is an image](https://miro.medium.com/max/331/1*B3pB4w1JCtx2EIW5zwiYCw.png)

Map: İçerisinde bulunan elemanları key-value ilişkisi ile yerleştirir. Elemanların value(değerleri) aynı olabilir ancak key(anahtarları) elemana erişmek için farklı olmak zorundadır.

Map’in collection hali yani salt okunur hali mapOf’tur. Mutable collections hali yani yazılabilir ve okunabilir halleri ise HashMap, hashMapOf ve mutableMapOf’tur.

![This is an image](https://miro.medium.com/max/362/1*JijHh1wmW8hefdt1m7xDNA.png)

Umarım faydalı olmuştur. Okuduğunuz için TEŞEKKÜRLER…
