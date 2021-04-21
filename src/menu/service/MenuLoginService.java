/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.service;

import ExceptionHandling.MyException;
import java.util.Scanner;
import menu.service.interfacee.IMenuLoginService;
import bean.Config;

/**
 *
 * @author Lenovo
 */
public class MenuLoginService implements IMenuLoginService {

    @Override
    public void processLogic()  {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter password");
        String password = sc2.nextLine();

        if (!username.equals("user") || !password.equals("11111")) {
            throw new MyException();

        }
        Config.instance().setLoggIn(true);

    }

}
