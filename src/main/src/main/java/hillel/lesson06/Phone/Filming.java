package hillel.lesson06.Phone;

public interface Filming {
    void makePhoto();

    void makeVideo();

    default public void shareVideo() {

    }
}
