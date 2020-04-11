## Strategy Design Pattern
Bir işlem gerçekleşeceği zaman birden fazla algoritma mevcut ise bu tasarım kalıbını takip ederek sorunu çözebiliriz.

Örnek üzerinde anlatmak daha uygun olur. Abstract Ördek sınıfımız olsun Ördekler ses çıkarabilen ve uçabilen nesnelerdir, ama istisnai durumlar da olabilir. Ördeği plastik oyuncak ördek, canlı ördek veya plastik süs ördek olarak düşünebiliriz.

Plastik Süs Ördek: Uçamaz, ses çıkaramaz.
Plastik Oyuncak Ördek: Uçamaz, ses çıkarablir.
Canlı Ördek: Uçabilir, ses çıkarabilir.

Bu karmaşıklığı önlemek için ördek nesnesinin yapabildiği temel becerileri Interface ile ayırdık.

![N|Solid](https://i.imgur.com/kxWV0kn.png)
