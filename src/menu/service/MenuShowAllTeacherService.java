/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.service;

import bean.Config;
import bean.Teacher;
import menu.service.interfacee.IMenuShowAllTeacherService;

/**
 *
 * @author Lenovo
 */
public class MenuShowAllTeacherService implements IMenuShowAllTeacherService {

    @Override
    public void processLogic() {
          Teacher[] teachers = Config.instance().getTeachers();
        
        for(int i=0;i<teachers.length;i++){
            System.out.println(teachers[i]);
        }
    }

}
