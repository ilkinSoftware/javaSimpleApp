/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import menu.service.*;
import bean.Config;
import proces.Proces;

/**
 *
 * @author Lenovo
 */
public enum Menu {
    LOGIN(1, "login", new MenuLoginService()),
    REGISTER(2, "register", new MenuRegisterService()),
    ADD_STURDENT(3, "add student ", new MenuAddStudentService()),
    ADD_TEACHER(4, "add teacher ", new MenuAddTeacherService()),
    SHOW_ALL_STUDENT(5, "show students ", new MenuShowAllStudentService()),
    SHOW_ALL_TEACHER(6, "show teachers ", new MenuShowAllTeacherService()),
    UNKNOWN;

    public int number;
    public String label;
    public Proces service;

    Menu() {

    }

    Menu(int number, String label, Proces service) {
        this.label = label;
        this.service = service;
        this.number = number;

    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();

    }

    public int getNumber() {
        return number;
    }

    public static Menu find(int num) {
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].getNumber() == num) {
                return menu[i];

            }

        }
        return Menu.UNKNOWN;

    }

    public static void showAllMenu() {
        Menu[] menu = Menu.values();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i] != Menu.UNKNOWN) {
                if (menu[i] == Menu.LOGIN || menu[i] == Menu.REGISTER) {
                    if (!Config.instance().isLoggIn()) {
                        System.out.println(menu[i]);
                    }
                } else if (Config.instance().isLoggIn()) {
                    System.out.println(menu[i]);

                }

            }

        }

    }

}
