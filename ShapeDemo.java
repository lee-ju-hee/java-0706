abstract class Shape{

    int size;

    public abstract void getArea();
}

class Triangle extends Shape{

    double x;
    double y;

    Triangle(double x1, double y1)
    {
        x = x1;
        y = y1;
    }

    public void getArea(){

        System.out.printf("삼각형의 크기: %f\n", (x * y)*1/2);
    }
}

class Rectangle extends Shape{

    double x;
    double y;

    Rectangle(double x2, double y2)
    {
        x = x2;
        y = y2;
    }

    public void getArea(){

        System.out.printf("사각형의 크기: %f\n", (x * y));
    }
}

class Circle extends Shape{

    double x;

    Circle(double x3)
    {
        x = x3;
    }

    public void getArea(){

        System.out.printf("원의 크기: %f\n", (x * x) * 3.14);
    }
}

public class ShapeDemo{

    public static void main(String[] args){

        Shape sha[] = new Shape[3];
        sha[0] = new Triangle(3,4);
        sha[1] = new Rectangle(4,4);
        sha[2] = new Circle(5);

        for(int i = 0; i < 3; i++)
        {
            sha[i].getArea();
        }
    }
}