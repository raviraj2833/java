class Moon {
    int radius;
    double pi = 3.14;

    public double Area() {
        return pi * (radius * radius);
    }

    public double Perimeter() {
        return 2 * (pi * radius);
    }

}

public class circle {
    public static void main(String[] args) {
        Moon mo = new Moon();
        mo.radius = 4;
        mo.Area();
        mo.Perimeter();
        System.out.println(mo.Area());
        System.out.println(mo.Perimeter());

    }
}
