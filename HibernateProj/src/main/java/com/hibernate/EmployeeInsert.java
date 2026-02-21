package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeInsert {

  public static void main(String[] args) {
    //To get the database connections
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    //database transactions (insert, update, delete...) 
    Session session = sessionFactory.openSession();
    //To start the operations 
    Transaction tx = session.beginTransaction();
    
    Employee emp = new Employee();
    emp.setEmpId(101);
    emp.setEmpName("Rupesh");
    emp.setSalary(7500.0);
    session.persist(emp);//insert into EmployeeInfo values (?,?,?)
    //session.save(emp);//deprecated in Hibernate 6
    
    //To commit the above operations
    tx.commit();
    session.close();
  }
}