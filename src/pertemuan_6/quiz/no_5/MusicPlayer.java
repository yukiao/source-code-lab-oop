package pertemuan_6.quiz.no_5;

public class MusicPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Pausing...");
    }

}
