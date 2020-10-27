package KR;

public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("black", 320, true, 7000000, false);
        mercedes.start();
        mercedes.accelerate(350);
    }

}
