package ru.suchkov.lesson5.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.suchkov.lesson5.entities.Student;

import java.util.List;

public class StudentDAO {
    private SessionFactory factory;

    private static StudentDAO ourInstance = new StudentDAO();

    public static synchronized StudentDAO getInstance() {
        return ourInstance;
    }

    private StudentDAO() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }

    // READ
    public List<Student> getAll() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Student> s = session.createQuery("from Student").getResultList();
        session.getTransaction().commit();
        session.close();
        return s;
    }

    // READ
    public Student findById(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student s = session.get(Student.class, id);
        session.getTransaction().commit();
        session.close();
        return s;
    }

    // DELETE
    public void deleteById(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Student s = session.get(Student.class, id);
        session.delete(s);
        session.getTransaction().commit();
        session.close();
    }

    // DELETE
    public void delete(Student student) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
        session.close();
    }

    // CREATE/UPDATE
    public void saveOrUpdate(Student student) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(student);
        session.getTransaction().commit();
        session.close();
    }
}
