public class Main {
    public static void main(String[] args) {

        Circle[] circles = new Circle[10];
        circles[0] = new Circle(1);
        circles[1] = new Circle(2);
        circles[2] = new Circle(3);
        circles[3] = new Circle(4);
        circles[4] = new Circle(5);
        circles[5] = new Circle(6);
        circles[6] = new Circle(7);
        circles[7] = new Circle(8);
        circles[8] = new Circle(9);
        circles[9] = new Circle(10);

        for (int i = 0; i < circles.length; i++) {
            System.out.printf("Площадь %d круга равна %.2f\n", i, circles[i].findArea());
            if (circles[i].findArea() % 3 == 0) {
                Circle.circlesMultiplesThree++;
            }
        }
        System.out.println("Количество кругов кратным 3 = " + Circle.getCirclesMultiplesThree());
    }
}