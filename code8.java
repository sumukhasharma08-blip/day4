class code8{
    public static void main(String[] args) {
        Car RR = new Car();
        RR.color = "White & Black";
        RR.run();
    }
}

class Car {
    String color;

    void run() {
        System.out.println("The car is running. Color: " + color);
    }
}
