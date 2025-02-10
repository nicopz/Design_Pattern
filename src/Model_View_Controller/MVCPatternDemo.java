package Model_View_Controller;
/*
Dieses Muster trennt Daten(Model), die Benutzeroberfläche (View) und die Steuerlogik (Controller)
 */

//Nutzung
public class MVCPatternDemo {
    public static void main(String[] args) {
        User user = new User("Alice");
        UserView view = new UserView();
        UserController controller = new UserController(user, view);

        controller.updateView();
        controller.setUserName("Bob");
        controller.updateView();
    }
}
