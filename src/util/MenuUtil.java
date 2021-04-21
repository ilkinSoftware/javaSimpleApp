/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import bean.Config;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MenuUtil {

    public static void showMenu() {

        Menu.showAllMenu();

        System.out.println("please selecting menu ");
        Config.initialize();
        Scanner scn = new Scanner(System.in);
        int selectedNumber = scn.nextInt();

        Menu selectedMenu = Menu.find(selectedNumber);

        selectedMenu.process();

    }

    private static void processMenu(Menu menu) {
        menu.process();

    }

}
