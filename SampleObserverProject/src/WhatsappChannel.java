public class WhatsappChannel extends Observable{

    String channelName;

     WhatsappChannel(String channelName){
         this.channelName=channelName;
    }

    public void publishNews(String announcement){
         System.out.println("Haber oluşturldu");

         System.out.println("Haber yayınlandı");

         this.publishPost(announcement);

         System.out.println("Haber tüm kullanıcılara bildirildi.");

    }

}
