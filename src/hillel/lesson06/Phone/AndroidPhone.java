package hillel.lesson06.Phone;

public class AndroidPhone extends Phone{
    @Override
    public void makeCall(String num) {
        System.out.println("Calling " + num + " from Android");
    }

    @Override
    public void playMusic() {

    }

    @Override
    public void playPodcast() {

    }

    @Override
    public void makePhoto() {

    }

    @Override
    public void makeVideo() {

    }

    @Override
    public void receiveCall(String num) {
        System.out.println("New call " + num + " on Android");
    }
}
