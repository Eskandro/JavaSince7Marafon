package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane firstPlane = new Airplane("КАПО", 2014, 28, 80);
        Airplane secondPlane = new Airplane("Boeing", 2012, 24, 60);
        Airplane.compareAirplanes(firstPlane, secondPlane);
    }
}
class Airplane {
    private String manufacturer;
    private int year;
    private int lenght;
    private double weight;
    private double fuel = 0;

    public Airplane(String manufacturer, int year, int lenght, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
    }
    public static void compareAirplanes(Airplane x, Airplane y){
        if(x.lenght > y.lenght) {
            System.out.println("Самолет " + x.manufacturer + " длиннее");
        } else if (x.lenght < y.lenght){
            System.out.println("Самолет " + y.manufacturer + " длиннее");
        } else if (x.lenght == y.lenght) {
            System.out.println("Длины самолетов одинаковые");
        }
    }

    void info() {
        System.out.println("Изготовитель " + manufacturer + "\nгод выпуска " + year + "\nдлина " + lenght + "\nвес " + weight + "\nкол-во топлива в баке " + fuel);
    }

    double fillUp(int n) {
        fuel += n;
        return fuel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getLenght() {
        return lenght;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }
}