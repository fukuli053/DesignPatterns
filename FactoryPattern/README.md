## Factory Method Design Patern

Kısaca tanımı ; aynı abstract sınıf veya interface'den türeyen nesnelerin üretiminden sorumlu yapıdır. Bu pattern ile nesne yaratılma işini inheritance yoluyla client-side'dan ayırıp sub-classes'lara vermek amaçlanır.

![alt text](https://1.bp.blogspot.com/-aILNl0IexsE/UmPMz543jWI/AAAAAAAAAkg/UIRlmLiW46A/s1600/factory.gif)

Örnek üzerinden ilerleyelim. Bir ekran üretimi yapan bir fabrikamız olduğunu düşünün. Bu fabrika tablet, mobil ve monitör ekranı üretebiliyor. Bu nesneleri "new" anahtar kelimesini kullanmadan Factory sınıfını kullanarak üretmeye çalışacağız. Tüm nesne yaratma işlemlerini bir sınıftan yürütmüş olacağız.

![alt text](https://i.imgur.com/iT29ODm.png)
