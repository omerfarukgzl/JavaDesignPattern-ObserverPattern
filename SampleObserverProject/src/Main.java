public class Main {
    public static void main(String[] args) {

        Observer omer = new WhatsappUser("omer","5551234567");
        WhatsappChannel softwareDeveloperChannel = new WhatsappChannel("Software Developer");

        softwareDeveloperChannel.registerUser(omer);
        softwareDeveloperChannel.publishNews("Java bitiyor mu ?");


    }
}