package ua.lviv.iot.Lab_1;


public record Insect(String name, double speed, double mass, boolean canFly,
                      int countOfQuotes) //ім'я, швидкість, маса, можливість літати, кількість лапок
{
    private static String color;

    public Insect() {
        this("", true, 0);
    }

    public Insect(String name, boolean canFly, int countOfQuotes) {
        this(name, 0.0, 0.2, true, 6);
    }

    public Insect(String name, double speed, double mass, boolean canFly, int countOfQuotes) {
        this.name = name;
        this.speed = speed;
        this.mass = mass;
        this.canFly = canFly;
        this.countOfQuotes = countOfQuotes;
    }

    @Override
    public String toString() {
        return "name=" + name + ", speed=" + speed + "m/s," + " mass=" + mass + "g," + " canFly=" + canFly + ", countOfQuotes=" + countOfQuotes;
    }

    public String toString2() {
        return "name=" + name + ", canFly=" + canFly + ", countOfQuotes=" + countOfQuotes;
    }

    private static String getColor() {
        return color;
    }
}
