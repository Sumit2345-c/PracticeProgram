package com.hibernate;

import com.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentUpdate {

    public static void main(String[] args){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        /* 
        Student stud = s.get(Student.class,111);
        stud.setMarks(550.0);
        s.merge(stud);*/
        MutationQuery query = s.createMutationQuery("update Student set marks=:marks where sname=:sname");
        query.setParameter("marks",650.0);
        query.setParameter("sname","Ramu");
        query.executeUpdate();
        tx.commit();
        s.close();
    }
}