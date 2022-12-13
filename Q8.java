class Car {
    String brand;
    public Car() {
        brand="Ford";
    }
    public String getBrand() {
        return brand;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Car c = new Car();
        String brand = c.getBrand();
        System.out.println(brand);
    }
}
