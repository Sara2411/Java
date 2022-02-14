public class MenuTest {

    static public void main(String[] args) {

        Menu menu = new Menu();

        menu.addOption("Open new account");
        menu.addOption("Log into existing account");
        menu.addOption("Help");
        menu.addOption("Quit");

        menu.display();
    }

}