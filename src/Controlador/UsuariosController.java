package Controlador;

import Modelo.Usuarios;
import Vista.LogIn;
import Vista.MenuPrincipal;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class UsuariosController {
    
    //metodo para revisar los usuarios registrados en la DB y permitir o no el accesio al menu principal del programa
    public static boolean Login(String nombre, String password) {
        Session sesion = NewHibernateUtilS.getSessionFactory().openSession();

        Usuarios usuario = (Usuarios) sesion.createCriteria(Usuarios.class).add(Restrictions.eq("nombre", nombre)).uniqueResult();
        if (usuario != null) {
            if (usuario.getPassword().equals(password)) {
                new MenuPrincipal().setVisible(true);
                
                JOptionPane.showMessageDialog(null, "Bienvenido "+nombre+ " Que Tengas Un Buen Dia!");
                return true;
            } else {
                
                JOptionPane.showMessageDialog(null, "Credenciales Incorrectas","Error Clave/Usuario", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario No Registrado", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
    //metodo para registrar un usuario a la DB y posteriormente poder logear con el (user y pass)
     public void agregarUsuario(Usuarios user) {
        SessionFactory sesion = NewHibernateUtilS.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
        Icon ico = new ImageIcon(getClass().getResource("/Imagenes/icons8-marca-de-verificación-64.png"));
        JOptionPane.showMessageDialog(null, "Usuario Guardado Correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE, ico);
    }
    
    
}
