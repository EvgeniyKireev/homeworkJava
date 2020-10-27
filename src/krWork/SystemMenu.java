package krWork;

import java.util.ArrayList;

public class SystemMenu {
    private ArrayList<Dish> menu = new ArrayList<>();
    private ArrayList<Dish> blacklst = new ArrayList<>();
    private Integer count = 0;
    public SystemMenu() {
        System.out.println("Меню создано");
    }

    public ArrayList<Dish> getMenuAr() {
        return menu;
    }
    public ArrayList<Dish> getBlackAr() {
        return blacklst;
    }
    public void getMenu() {
        for (int i=0; i<menu.size(); i++){
            System.out.println(menu.get(i).getName() + " " + menu.get(i).getPrice() + " рублей");
        }
    }

    public void addMenu(Dish dish) {
        menu.add(dish);
        count++;
    }

    public void deleteMenu(Dish dish) {
        for (int i=0; i<menu.size(); i++){
            if (dish.getName() == menu.get(i).getName()){
                menu.remove(i);
                System.out.println("Блюдо удалено");
                count--;
            } else{
                System.out.println("Блюдо не найдено");
            }
        }
    }
    public ArrayList<Dish> addBlackList(Dish dish){
        blacklst.add(dish);
        return blacklst;
    }
    public void getCount() {
        System.out.println("Количество: "  + count);
    }
}
