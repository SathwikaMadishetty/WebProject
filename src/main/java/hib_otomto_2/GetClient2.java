package hib_otomto_2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class GetClient2 {
    public static void main(String[] args) {

        Session session = HSFactory.getSession();

        Transaction tx = session.beginTransaction();

        Emp e = session.get(Emp.class, 1);   // 1 = Primary Key

        if (e != null) {
            System.out.println("Employee Name: " + e.getEname());
            System.out.println("Salary: " + e.getSal());
        } else {
            System.out.println("Employee Not Found");
        }

        tx.commit();
        session.close();
    }
}