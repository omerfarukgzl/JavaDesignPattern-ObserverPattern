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

## Whatsapp kullanıcılarının Whatsapp kanallarına abone olması ve gönderi bildirimlerini alması


### Observer Interface
![Observer Interface](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/d1670b2f-ad06-4504-804c-0dc474eabb22)
Yukarıda yer alan Observer Interface'i, bildiri almak isteyen sınıflara gözlemleyici  özelliğini kazandırması ve bu sınıfları kullanırken gözlemleyici olan metodları garanti etmesi amacıyla oluşturulmuştur. Prensip olarak Dependency Inversion ilkesine dayanmaktadır.
<br />


### Whatsapp User
![Whatsapp User ](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/551f760d-fe0b-463b-9000-ca3c85aa7848)
Whatsapp User sınıfı, whatsapp uygulaması kullanıcılarını simüle etmek için oluşturulmuştur. Bu kullanıcılar takip etmek istedikleri whatsapp kanallarına abone olarak gelecek bildirimleri alabilecek ve gönderilerden haberdar olacaktır. Temel olarak bakıldığında Whatsapp User sınıfının ilgil kanalların bildirimlerini gözlemleyici özelliği vardır. Bu özelliği ise yukarıda bahsedilen Observer interface'ini implement ederek kazanmıştır. Bu sayede abone olduğu kanal için bir gözelemleyici sınıf haline gelmiştir. 
<br />


### Whatsapp Channel
![Whatsapp Channel](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/a58cad65-88e0-4150-9169-e3be0171988b)
Whatsapp Channel sınıfı, whatsapp uygulaması içerisinde yer alan kanalları simüle etmek için oluşturulmuştur. Bu sınıf bir gönderi yayınlamak istedğinde öncelikle o gönderiyi oluşturacak, yayınlayacak ve kendisine abone olan kullancılara bildirim sağlayacaktır. Fakat bu bildirimin sağlanabilmesi için kendisine abone olmak ve bildirim almak isteyen kullanıcın Observer özelliğinde olması gerekmektedir. Bu sayede özel bir sınıfa bağımlı kalmadan tüm Observer özelliğinde olan sınıflara bildirim sağlayabilecektir. Bu durum ise Dependency inversion ilkesine dayanmaktadır.
<br />



![Observable](https://github.com/omerfarukgzl/JavaDesignPattern-ObserverPatern/assets/58605364/5d3af5ab-660b-4cc5-9470-2ae5951673b8)

Observale sınıfı bir abstract class 'dır. Bunun sebebi 









