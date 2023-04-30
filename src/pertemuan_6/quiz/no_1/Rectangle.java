package pertemuan_6.quiz.no_1;

class Rectangle extends Shape {
    double width, length;

    @Override
    double calculatePerimeter() {
        return 2 * (width + length);
    }

}
