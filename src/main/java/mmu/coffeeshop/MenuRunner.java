package mmu.coffeeshop;

import mmu.coffeeshop.menu.*;

import java.util.Scanner;

public class MenuRunner implements TextDisplay {

    public void run(Menu initialMenu) {
        Menu currentMenu = initialMenu;

        while (currentMenu != null) {
            currentMenu.onDisplay();
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            currentMenu = currentMenu.chooseOption(option);
            scanner.close();
        }
    }

    public void displayLine(String line) {
        System.out.println(line);
    }
}