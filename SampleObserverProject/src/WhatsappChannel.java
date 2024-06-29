public class WhatsappChannel extends Observable{

    private String channelName;

     WhatsappChannel(String channelName){
         this.channelName=channelName;
    }



    public void publishNews(String announcement){
        System.out.println("==================================================================================");
        System.out.println("==================================================================================");

        System.out.println("***" + this.channelName + "Kanalında yeni haber oluşturldu ***");
        System.out.println("***" + this.channelName + " Kanalında yeni haber yayınlandı ");
        System.out.println("----------------------------------------------------------------------------------");

        this.publishPost(this.channelName, announcement);

        System.out.println("***" +this.channelName + " Haberi tüm kullanıcılara bildirildi ");
        System.out.println("==================================================================================");

    }

}
