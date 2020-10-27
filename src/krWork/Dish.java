package krWork;

public class Dish{
    private String name;
    private String сomposition;
    private String portion;
    private Integer price;
    public Dish(String name, String composition, String Portion, Integer price) {
        this.name = name;
        this.сomposition = composition;
        this.portion = portion;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getPortion() {
        return portion;
    }

    public String getСomposition() {
        return сomposition;
    }
}
