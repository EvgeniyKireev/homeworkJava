import models.Auto;
import models.User;
import services.AutoService;
import services.UserService;
import models.Auto;
import models.User;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
//        User user = new User("Liza",19);
//        userService.saveUser(user);
        AutoService autoService = new AutoService();
//        Auto auto = new Auto("zaporozhec", "purple");
//        user.addAuto(auto);
//        auto.setUser(user);
//        userService.updateUser(user);
//        Auto mercedes = new Auto("mercedes", "black");
//        autoService.saveAuto(mercedes);
//        mercedes.setUser(user);
//        autoService.updateAuto(mercedes);
        System.out.println(userService.findAutoById(1));
        System.out.println(autoService.findAllAutos());

    }
}