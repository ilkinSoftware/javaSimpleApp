/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.service;

import bean.Student;
import java.util.Scanner;
import menu.service.interfacee.IMenuAddStudentService;
import bean.Config;
/**
 *
 * @author Lenovo
 */
public class MenuAddStudentService implements IMenuAddStudentService {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc2.nextLine();
        
        Student s = new Student();
        s.setName(name);
        s.setSurName(surname);
        System.out.println("Added new student");
        
        Config.instance().addStudents(s);
        
        
    }

}
