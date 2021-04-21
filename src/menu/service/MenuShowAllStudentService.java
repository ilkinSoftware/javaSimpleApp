/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.service;

import menu.service.interfacee.IMenuShowAllStudentService;
import bean.Config;
import bean.Student;

/**
 *
 * @author Lenovo
 */
public class MenuShowAllStudentService implements IMenuShowAllStudentService {

    @Override
    public void processLogic() {
        
        Student[] students = Config.instance().getStudents();
        
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        
        
    }

    

}
