package Modelo;
// Generated Oct 11, 2018 11:38:00 AM by Hibernate Tools 4.3.1




public class Empresa  implements java.io.Serializable {


     private Integer idempresa;
     private String nombre;
     private String direccion;
     private String cuil;
     private String telefono;
     private String rubro;
     private String ceo;
     private String actividad;
     private String descripcion;

    public Empresa() {
    }

    public Empresa(String nombre, String direccion, String cuil, String telefono, String rubro, String ceo, String actividad, String descripcion) {
       this.nombre = nombre;
       this.direccion = direccion;
       this.cuil = cuil;
       this.telefono = telefono;
       this.rubro = rubro;
       this.ceo = ceo;
       this.actividad = actividad;
       this.descripcion = descripcion;
    }
   
    public Integer getIdempresa() {
        return this.idempresa;
    }
    
    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCuil() {
        return this.cuil;
    }
    
    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getRubro() {
        return this.rubro;
    }
    
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    public String getCeo() {
        return this.ceo;
    }
    
    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
    public String getActividad() {
        return this.actividad;
    }
    
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


