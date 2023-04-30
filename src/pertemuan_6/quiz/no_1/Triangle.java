package pertemuan_6.quiz.no_1;

class Triangle extends Shape {

    double aSide, bSide, cSide;

    @Override
    double calculatePerimeter() {
        return aSide + bSide + cSide;
    }

}
