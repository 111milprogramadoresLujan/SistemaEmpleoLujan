
package Controlador;

import Modelo.*;

import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class EmpresaController {




   public static List<Empresa> MostrarEmpresa(){
       Session sesion = HibernateUtils.getSessionFactory().openSession();
       List<Empresa> empresas = sesion.createCriteria(Empresa.class).list();
       return empresas;
   }
    
     public void agregarEmpresa(Empresa emp) {
        SessionFactory sesion = HibernateUtils.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(emp);
        tx.commit();
        session.close();
        Icon ico = new ImageIcon(getClass().getResource("/Imagenes/icons8-marca-de-verificación-64.png"));
        JOptionPane.showMessageDialog(null, "Empresa Registrada Correctamente", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE, ico);
    }
    
 public void eliminarEmpresa(Empresa emp) {
        SessionFactory sesion = HibernateUtils.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(emp);
        tx.commit();
        session.close();
        Icon ico = new ImageIcon(getClass().getResource("/Imagenes/icons8-marca-de-verificación-64.png"));
        JOptionPane.showMessageDialog(null, "Empresa Registrada Correctamente", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE, ico);
    }
      
      
       
    }
    




