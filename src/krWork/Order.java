package krWork;

import java.util.ArrayList;

public class Order {
    private Integer tableId;
    private ArrayList<Dish> orders = new ArrayList<>();
    private Integer price = 0;
    private ArrayList<Dish> serve = new ArrayList<>();
    private SystemMenu menu;
    public Order(Integer tableId, SystemMenu menu){
        this.tableId = tableId;
        this.menu = menu;
    }
    public void getMenu() {
        for (int i=0; i<menu.getMenuAr().size(); i++){
            System.out.println("Доступно для заказа: " + menu.getMenuAr().get(i));
        }
    }
    public void addDish(Dish dish){
        if (menu.getMenuAr().indexOf(dish) == -1) {
            System.out.println(dish.getName() + " нет в меню");
            return;
        }
        if(menu.getMenuAr().indexOf(dish) != -1 && menu.getBlackAr().indexOf(dish) == -1 ){
            orders.add(dish);
            price += dish.getPrice();
            System.out.println("Блюдо " + dish.getName() +" успешно добавлено");
        } else {
            System.out.println("На данный момент блюдо " + dish.getName() + " отсутствует");
        }
    }
    public void getOrder() {
        System.out.println("Номер стола: " + tableId);
        for (int i=0; i<orders.size(); i++){
            System.out.println("Блюдо: " + orders.get(i).getName());
            }
        System.out.println("Общая цена: " + price + " рублей");
    }
    public void serveDish(Dish dish){
        if(orders.indexOf(dish) != -1 && serve.indexOf(dish) == -1 && menu.getMenuAr().indexOf(dish) != -1 && menu.getBlackAr().indexOf(dish) == -1) {
            serve.add(dish);
            System.out.println("Блюдо подано");
        }
        else {
            if (menu.getBlackAr().indexOf(dish) != -1) {
                System.out.println("Ошибка, блюдо отсутсвует");
                return;
            }
            if (menu.getMenuAr().indexOf(dish) == -1) {
                System.out.println("Ошибка, блюдо отсутсвует");
                return;
            }
            System.out.println("Блюдо уже было подано");
        }
    }

    public void getServe() {
        for (int i=0; i<serve.size(); i++){
            System.out.println("Подано: " + serve.get(i));
        }
    }

    public void closeOrder() {
        getOrder();
        System.out.println("Заказ успешно закрыт");
        orders = new ArrayList<>();
        price = 0;
    }
}
