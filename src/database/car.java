
package database;

public class car {
    private static String model;
    private static String color;
    private static int code_car;
    private static int price;
    private static int year_of_purchase;
    private static int max_speed;
    
    public car()
    {
        car.model = "KAI";
        car.color = "Black";
        car.code_car = 1234;
        car.price = 1000000;
        car.year_of_purchase = 2020;
        car.max_speed = 320;
    }
    public static void display()
    {
        System.out.println("Car Attributes : " + getModel() + " , " + getColor() + " , " + 
                getCode_car() + " , " + getPrice() + " , " + getYear_of_purchase() + " , " + getMax_speed());
    }
    
    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        car.model = model;
    }

    public static int getCode_car() {
        return code_car;
    }

    public static void setCode_car(int code_car) {
        car.code_car = code_car;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        car.price = price;
    }

    public static int getYear_of_purchase() {
        return year_of_purchase;
    }

    public static void setYear_of_purchase(int year_of_purchase) {
        car.year_of_purchase = year_of_purchase;
    }

    public static int getMax_speed() {
        return max_speed;
    }

    public static void setMax_speed(int max_speed) {
        car.max_speed = max_speed;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        car.color = color;
    }
    
    
}
