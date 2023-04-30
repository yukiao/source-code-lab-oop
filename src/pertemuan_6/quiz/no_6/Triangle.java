package pertemuan_6.quiz.no_6;

class Triangle extends Shape {
    double base, height;

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

}
