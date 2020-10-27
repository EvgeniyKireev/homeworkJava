package KR;

public class Mercedes  extends Car{
    private boolean isUber;
    private String brand = "Mercedes";
    protected Mercedes(String color, int maxSpeed, boolean isAutoTransmission, int price, boolean isUber) {
        super(color, maxSpeed, isAutoTransmission, price);
        this.isUber = isUber;
    }

    public String getBrand() {
        return brand;
    }
}