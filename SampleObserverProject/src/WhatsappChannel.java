public class WhatsappChannel extends Observable{

    private String channelName;

     WhatsappChannel(String channelName){
         this.channelName=channelName;
    }

    public void publishNews(String announcement){
         System.out.println("Yeni Haber oluşturldu");

         System.out.println("Yeni Haber yayınlandı");

         this.publishPost(this.channelName, announcement);

         System.out.println("Haber tüm kullanıcılara bildirildi.");

    }

}
