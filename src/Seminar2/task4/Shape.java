package Seminar2.task4;

public abstract class Shape {
    public double volume;

    protected Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
