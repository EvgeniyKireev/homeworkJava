package krWork;

public class Main {
    public static void main(String[] args) {
        Dish apple = new Dish("apple", "apple", "100g", 35);
        Dish burger = new Dish("burger", "хлеб, котлета, соусы, лук, помидоры, огурец", "200", 240);
        Dish carbonara = new Dish("carbonara", "спагеттии, соусы, мясо", "300g", 400);
        Dish cola = new Dish("cola", "сахар, карамель итд", "330", 100);
        SystemMenu menu = new SystemMenu();
        menu.addMenu(apple);
        menu.addMenu(carbonara);
        menu.addMenu(cola);
        menu.getMenu();
        menu.addBlackList(cola);
        menu.deleteMenu(apple);
        Order order = new Order(1, menu);
        order.addDish(carbonara);
        order.addDish(apple);
        order.addDish(burger);
        order.addDish(cola);
        order.serveDish(cola);
        order.getOrder();
        order.closeOrder();
    }
}
