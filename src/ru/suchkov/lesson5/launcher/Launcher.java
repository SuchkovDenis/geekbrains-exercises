package ru.suchkov.lesson5.launcher;

import ru.suchkov.lesson5.DAO.StudentDAO;
import ru.suchkov.lesson5.entities.Student;

import java.util.List;
import java.util.UUID;

public class Launcher {
    public static void main(String[] args) {
        StudentDAO dao;
        Student student;
        List<Student> students;

        // init DAO
        dao = StudentDAO.getInstance();

        // CREATE
        for (int i = 0; i < 10; i++) {
            dao.saveOrUpdate(new Student("name-" +
                    UUID.randomUUID().toString().substring(0,4),
                    (int) (99 * Math.random())));
        }

        // READ ALL
        System.out.println("READ ALL");
        students = dao.getAll();
        print(students);
        delimit();

        // READ WITH id = 6
        System.out.println("READ WITH id = 6");
        student = dao.findById(6);
        System.out.println(student);
        delimit();

        // UPDATE Student WITH id = 6
        System.out.println("UPDATE Student name WITH id = 6");
        student.setName("NEW NAME!");
        dao.saveOrUpdate(student);
        System.out.println(dao.findById(6));
        delimit();


        // DELETE Student WITH id = 3
        System.out.println("DELETE STUDENT WITH id = 3");
        print(dao.getAll());
        delimit();
    }

    public static void print(List<Student> studentList) {
        System.out.println("------------------------------");
        System.out.println("|  id\t\tname\t\tmark |");
        System.out.println("------------------------------");
        for (Student student : studentList) {
            System.out.println(String.format("|%4d\t%8s\t%6d   |",student.getId(), student.getName(), student.getMark()));
        }
        System.out.println("------------------------------");
    }

    public static void delimit() {
        System.out.println("\n\n");
    }
}
