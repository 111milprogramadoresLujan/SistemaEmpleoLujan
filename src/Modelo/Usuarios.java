package Modelo;
// Generated Oct 11, 2018 11:38:00 AM by Hibernate Tools 4.3.1




public class Usuarios  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String password;
     private String sexo;
     private String email;

    public Usuarios() {
    }

	
    public Usuarios(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
    public Usuarios(String nombre, String password, String sexo, String email) {
       this.nombre = nombre;
       this.password = password;
       this.sexo = sexo;
       this.email = email;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


