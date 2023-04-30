package pertemuan_6.quiz.no_8;

class Circle implements Resizeable {
    double radius;

    @Override
    public void resize(double percentage) {
        radius = percentage * radius;
    }

}
