public class WhatsappUser implements Observer{
    String name;
    String telNumber;

    WhatsappUser(String name, String telNumber){
        this.name=name;
        this.telNumber=telNumber;
    }

    @Override
    public void getPostNotification(String whatsappChannelName,String announcement) {
        System.out.println("Hey " + name + "  "+ whatsappChannelName +" Kanalının yeni gönderi bildirimi var!");
        System.out.println("Haber içeriği: " + announcement);
    }
}
