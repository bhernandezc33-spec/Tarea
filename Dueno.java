 public class Dueno {
     private long id;
     private String nombreCompleto;
     private String telefono;
     private String email;
     private String direccion;

     public void setId(long id) {this.id = id;}
     public long getId() {return id;}
     public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}
     public String getNombreCompleto() {return nombreCompleto;}
     public void setTelefono(String telefono) {this.telefono = telefono;}
     public String getTelefono() {return telefono;}
     public void setEmail(String email) {this.email = email;}
     public String getEmail() {return email;}
     public void setDireccion(String direccion) {this.direccion = direccion;}
     public String getDireccion() {return direccion;}
     public void actualizarTelefono(String telefono) {this.telefono = telefono;}
     public void actualizarEmail(String email) {setEmail(email);}
 }
