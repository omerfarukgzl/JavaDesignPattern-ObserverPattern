Merhabalar.

Bu yazımda sizlere tasarım desenlerinin sıklıkla kullanılan Gözlemci (Observer) Tasarım Kalıbı konusunu anlatmaya çalışacağım.

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


Bahsetmiş olduğumuz örnek problemlerde mevcut olan ortak özellik farkedildiği üzere bir tarafın bildiri / yayın yapma isteği 
iken diğer tarafın ise gözlemleme, dinleme ve abone olması eğilimidir. Benzer sorunlara çözüm üretmek amacı ile tasarlanan bu yapı ise 
temelinde yayım yapan sınıf ve abone olan gözlemci sınıflar olarak ikiye ayrılan özneleri barındırır.

İki özneden biri olan yayım yapan bildiri sınıfı, ilgili işlevini yerine getirirken bu işlevi yaptığına dair yayım etkinliğini uygular.
Yani ilgili işleyişi yapar ve bu haberi yayar. Bunun yanında diğer özne olan gözlemci sınıf abone olmak için kendini bu yayım etkinliğine kayıt eder. 
Yani her yayım etkinliğinde bu sınıf da haberdar edilir. Bu sayede yayım yapan ve gözlemleyen sınıf arasında bildiri iletişimi kurulmuş olur. 
Artık her bildiri yapıldığında gözlemci sınıflar haberdar edilecektir.

Temel olarak bu çerçevede ilerleyen Gözlemci Tasarım Kalıbını örnek bir problem ile kodlayarak pekiştirmeye çalışalım.














