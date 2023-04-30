package pertemuan_6.quiz.no_8;

class Rectangle implements Resizeable {
    double width, height;

    @Override
    public void resize(double percentage) {
        width = percentage * width;
        height = percentage * height;
    }

}