package pertemuan_6.quiz.no_5;

class VideoPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Video");
    }

    @Override
    public void pause() {
        System.out.println("Pausing...");
    }

}
