/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.service;

import bean.Teacher;
import java.util.Scanner;
import menu.service.interfacee.IMenuAddTeacherService;
import bean.Config;
/**
 *
 * @author Lenovo
 */
public class MenuAddTeacherService implements IMenuAddTeacherService {

    @Override
    public void processLogic() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");  
        String surname = sc2.nextLine();
        
        Teacher t =  new Teacher();
        t.setName(name);
        t.setSurName(surname);
        System.out.println("Added new teacher");
        Config.instance().addTeacher(t);

    }

}
