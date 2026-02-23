public class Car {
    String color;
    String model;
    int speed;

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.speed = 120;
        System.out.println(myCar.color);
        System.out.println(myCar.model);
        System.out.println(myCar.speed);
    }
}