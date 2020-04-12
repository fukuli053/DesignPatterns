## Decorator Pattern

Decorator tasarım deseni, structural tasarım desenlerinden biridir. Bir nesneye çalışma zamanında (runtime) yeni özellikler eklemek için kullanılır. Kalıtım kullanmadan da bir nesnenin görevlerini artırabileceğimizi gösterir.

## Ne zaman kullanılır ?
Runtime zamanında bir nesneye yeni özellikler eklemek istersek bu tasarım kalıbı kullanılabilir.

## Genel Yapısı
![alt text](https://1.bp.blogspot.com/-RVRtvFsLVKM/XRJ-lhNjWMI/AAAAAAAADFU/wLpV9vOKLuUnWnS-gGjIWOWEfj7dixecgCLcBGAs/s1600/400px-Decorator_UML_class_diagram.svg.png)


## Problem ?
Problem
Diyelim ki var olan bir nesnenin sınıfına müdahale etmeden, yeni bir method ya da özellik eklemek istiyoruz. Aklınıza ilk olarak miras yolu geliyor değil mi ? Ancak öyle bir örnek düşünün ki miraslar havada uçuşabilir.

Bir örnekle açıklayalım. Var olan nesnemizi starbucks'tan aldığımız kahve olarak düşünelim. Ekstra olarak barista bize süt, şeker ve aroma eklemek istiyor muyuz diye soruyor. Her birini ayrı ayrı kahve sınıfından türettiğimizi düşünürsek bakalım nasıl bir yapı ortaya çıkıyor: 
![alt text](https://i.hizliresim.com/TzabLI.png)

## Çözüm
Beverage(İçecek)

AddonDecorator(İçecek Eklentimiz) - Decarator Sınıfımız. İstediğimiz her özelliği decarator sınıfı sayesinde esnek şekilde içeceğimize kazandırabiliyoruz.

![alt text](https://i.hizliresim.com/ZaX2bF.png)
