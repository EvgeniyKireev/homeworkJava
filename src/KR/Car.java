package KR;

import javax.annotation.processing.SupportedSourceVersion;

abstract public class Car {
    private String color;
    private int maxSpeed;
    private boolean isAutoTransmission;
    private int speed =0;
    private int price;
    protected Car(String color, int maxSpeed, boolean isAutoTransmission, int price) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isAutoTransmission = isAutoTransmission;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public boolean getIsAutoTransmission() {
        return isAutoTransmission;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }
    public void start() {
    if(this.speed==0) {
        this.accelerate(this.speed+20);
        System.out.println("Успешно, машина поехала.");
    }
    else {
        System.out.println("Вы уже едете");
    }
    }
    public void stop() {
        if(this.speed==0) {
            System.out.println("Вы и так стоите на месте");
        }
        else {
            this.setSpeed(0);
            System.out.println("Вы успешно остановились");
        }
    }
    public void accelerate(int acc) {
        if (this.speed+acc < this.maxSpeed) {
            this.setSpeed(this.speed+acc);
            System.out.println("Скорость: " + this.speed + " км*/ч");
        }
        else  {
            this.setSpeed(this.maxSpeed);
            System.out.println("Вы достигли максимальной скорости в " + this.maxSpeed + " км/ч");
        }
    }
}
