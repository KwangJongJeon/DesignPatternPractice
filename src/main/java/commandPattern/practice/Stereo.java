package commandPattern.practice;

public class Stereo {
    public void on() {
        System.out.println("Stereo On");
    }

    public void off() {
        System.out.println("Stereo Off");
    }

    public void setCD() {
        System.out.println("Stereo CD set");
    }

    public void setVolume(int volume) {
        System.out.println("Current Volume: " + volume);
    }
}
