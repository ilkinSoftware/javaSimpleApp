/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


@notEmpity
public class Student extends Person {
    
    private String schoolName;
    
    @notEmpity
    private double scoolarShip;
    
    @notEmpity
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScoolarShip() {
        return scoolarShip;
    }

    public void setScoolarShip(double scoolarShip) {
        this.scoolarShip = scoolarShip;
    }
    
    
}
