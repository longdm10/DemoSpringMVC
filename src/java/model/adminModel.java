/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.TblAdmin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author s03tapnd
 */
public class adminModel {

    private static SessionFactory sf = HibernateUtil.getSessionFactory();

    public TblAdmin getRow(int id) {
        //try {
            Session ss = sf.openSession();
            ss.beginTransaction();
            return (TblAdmin) ss.get(TblAdmin.class, id);
        //} catch (Exception e) {
            //return null;
        //}

    }
    
      public boolean save(TblAdmin item) {
        //try {
            Session ss = sf.openSession();
            ss.beginTransaction();
            ss.update(ss);
            ss.getTransaction().commit();
            return true;
        //} catch (Exception e) {
            //return null;
        //}

    }
}
