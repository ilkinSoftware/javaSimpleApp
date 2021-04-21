/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import util.FileUtility;

/**
 *
 * @author Lenovo
 */
public class Config implements Serializable {

    private static Config config = null;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private boolean loggIn;
    private static final String fileName = "app.obj";

    public static void initialize() {
        Object obj = FileUtility.readFileDeserialize(fileName);

        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    public static void save() {
        FileUtility.writeObjectToFile(instance(), fileName);
    }

    public boolean isLoggIn() {
        return loggIn;
    }

    public void setLoggIn(boolean loggIn) {
        this.loggIn = loggIn;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public Student[] addStudents(Student s) {
        Student[] newStudents = new Student[students.length + 1];

        System.arraycopy(students, 0, newStudents, 0, students.length);

        newStudents[newStudents.length - 1] = s;

        students = newStudents;
        return students;

    }

    public Teacher[] addTeacher(Teacher t) {

        Teacher[] newTeachers = new Teacher[teachers.length + 1];

        System.arraycopy(students, 0, newTeachers, 0, teachers.length);

        newTeachers[newTeachers.length - 1] = t;

        teachers = newTeachers;
        return teachers;

    }

}
