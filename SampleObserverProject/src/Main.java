public class Main {
    public static void main(String[] args) {

        Observer omer = new WhatsappUser("omer","5551234567");
        Observer furkan = new WhatsappUser("furkan","5561234567");
        Observer taha = new WhatsappUser("taha","5571234567");
        Observer ismail = new WhatsappUser("ismail","5571234567");

        WhatsappChannel softwareDeveloperChannel = new WhatsappChannel("Software Developer");

        softwareDeveloperChannel.registerUser(omer);
        softwareDeveloperChannel.registerUser(furkan);
        softwareDeveloperChannel.registerUser(taha);

        softwareDeveloperChannel.publishNews("Java bitiyor mu ?");


    }
}