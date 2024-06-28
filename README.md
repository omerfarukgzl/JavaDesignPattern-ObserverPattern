Merhabalar.

Bu yazımda sizlere tasarım desenlerinin sıklıkla kullanılan **Gözlemci (Observer) Tasarım Kalıbı** konusunu inşallah anlatmaya çalışacağım.

Tasarım kalıpları, belirli problemlere karşı çözüm getirmek amacıyla tasarlanmış ve problemlerin çözümünde herkes tarafından 
benimsenerek daha kolay anlaşılan pratik çözüm yolları haline gelmiştir.Bu çözüm yollarından biri olan Gözlemci Tasarım Kalıbı (Observer Design Patern), 
abone ve yayımcı mantığında işleyen yapıya sahiptir. 

Gözlemci tasarım kalıbının daha iyi anlaşılabilmesi için öncelikle çıkış amacı olan problemlerden biraz bahsedelim.

Örnek Problemler:

* Haber yayımı yapan sınıfın haber yayınlarına abone olmak ve bu haberleri canlı olarak kullanıcıya göstermek

* Alarm üreten sınıfın uyarı bildirimini ilgili tüm birimlere iletmek.

* Button tıklanma etkinliğine bağlı olarak işleyişini sürdüren sınıfları tıklanma etkinliğinden haberdar etmek.

* Kampanya bildirimlerini almak isteyen sınıflara gönderilecek bildirimleri iletmek.

* Hareketli oyun objesini gözetleyen nesnelere objenin konumunu sürekli olarak bildirmek.

* Oyun objesinin çarpma etkinliğini bu etkinliği dinlemek isteyen objelere iletmek vb.

<br />

Bahsetmiş olduğumuz örnek problemlerde mevcut olan ortak özellik farkedildiği üzere bir tarafın bildiri / yayın yapma isteği 
iken diğer tarafın ise gözlemleme, dinleme ve abone olması eğilimidir. Benzer sorunlara çözüm üretmek amacı ile tasarlanan bu yapı ise 
temelinde yayım yapan sınıf ve abone olan gözlemci sınıflar olarak ikiye ayrılan özneleri barındırır.

İki özneden biri olan yayım yapan bildiri sınıfı, ilgili işlevini yerine getirirken bu işlevi yaptığına dair yayım etkinliğini uygular.
Yani ilgili işleyişi yapar ve bu haberi yayar. Bunun yanında diğer özne olan gözlemci sınıf abone olmak için kendini bu yayım etkinliğine kayıt eder. 
Yani her yayım etkinliğinde bu sınıf da haberdar edilir. Bu sayede yayım yapan ve gözlemleyen sınıf arasında bildiri iletişimi kurulmuş olur. 
Artık her bildiri yapıldığında gözlemci sınıflar haberdar edilecektir.

Temel olarak bu çerçevede ilerleyen Gözlemci Tasarım Kalıbını örnek bir problem ile kodlayarak pekiştirmeye çalışalım.

<br />

## Whatsapp kullanıcılarının whatsapp kanallarına abone olması ve gönderi bildirimlerini alması


### Observer Interface
![Observer Interface](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/d1670b2f-ad06-4504-804c-0dc474eabb22)
Yukarıda yer alan Observer Interface'i, bildiri almak isteyen sınıflara gözlemleyici  özelliğini kazandırması ve bu sınıfları kullanırken gözlemleyici olan metodları garanti etmesi amacıyla oluşturulmuştur. Prensip olarak Dependency Inversion ilkesine dayanmaktadır.
<br />


### Whatsapp User
![Whatsapp User](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/6342dbf2-0285-41c6-a7b2-1955eaa8d23e)

Whatsapp User sınıfı, whatsapp uygulaması kullanıcılarını simüle etmek için oluşturulmuştur. Bu kullanıcılar takip etmek istedikleri whatsapp kanallarına abone olarak gelecek bildirimleri alabilecek ve gönderilerden haberdar olacaktır. Temel olarak bakıldığında Whatsapp User sınıfı ilgili kanalların bildirimlerini gözlemleyici özelliğine sahiptir. Bu özelliği ise yukarıda bahsedilen Observer interface'ini implement ederek kazanmıştır. Bu sayede abone olduğu kanal için bir gözelemleyici sınıf haline gelmiştir. 
<br />


### Whatsapp Channel
![Whatsapp Channel](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/a58cad65-88e0-4150-9169-e3be0171988b)
Whatsapp Channel sınıfı, whatsapp uygulaması içerisinde yer alan kanalları simüle etmek için oluşturulmuştur. Bu sınıf bir gönderi yayınlamak istedğinde öncelikle o gönderiyi oluşturacak, yayınlayacak ve kendisine abone olan kullancılara miras aldığı abstract class da mevcut olan **publishPost** metodu sayesinde bildirim sağlayacaktır. Fakat bu bildirimin sağlanabilmesi için kendisine abone olmak ve bildirim almak isteyen kullanıcın Observer özelliğinde olması gerekmektedir. Bu sayede özel bir sınıfa bağımlı kalmadan tüm Observer özelliğinde olan sınıflara bildirim sağlayabilecektir. Bu durum ise Dependency inversion ilkesine dayanmaktadır.
<br />


### Observable
![Observable](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/5d3af5ab-660b-4cc5-9470-2ae5951673b8)
Observale sınıfı gözlemlenebilme, bildirmi yayma özelliğine sahiptir . Bu sınıfın abstract class olmasının sebebi ise herhangi bir nesne türetimi olmadan alt sınıfa gözlemlenebilme özelliğini kazandırmaktır. Bu özelliğin interface kullanılarak kazandırılmamasının sebebi ise bildiri yapacak metodun ve abone olan kullanıcıların her bir alt sınıfında yazılması yerine ortak olan üst sınıfta ortak olarak yazılmasıdır. Dolayısıyla observable olmak isteyen sınıflar bu sınıfı miras almalı ve bu sınıfın barındırdığı metodları kullanmalıdır.
<br />

### Main Class
![main](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/a13f9a5d-4f38-4e77-b7c0-cba91cd281d9)
Main sıfında Whatsapp kullanıcıları ve kanalları oluşturulmuştur. Akabinde ise ilgili kullanıcılar ilgili kanallara abone edilmiş ve daha sonra ilgili kanallarda yeni haberler oluşturulmuştur.


 ### Output
 ![Output](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/2e2b8de6-7a8f-452f-ba78-c62320a74551)
Çalıştırılan programın çıktısı ise görüldüğü üzere ilk olarak software developer kanalında haber oluşturulmuş ve yayınlanmıştır. Daha sonra bu oluşturulan haberin bildirimi bu kanala abone olan kullanıcalara iletilmiştir. Ardından aynı işlemler hardware kanalı için gerçekleşmiştir.  

Görüldüğü üzere kanallarda yapılan her yeni haber abone olan kullanıcılara bildirilmiştir. Bu yapı sayesinde her kanal nesnesinin kendisine ait abone kullanıcıları oluşacaktır.


 

