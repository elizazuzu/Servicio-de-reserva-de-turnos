package turnos.src;

import java.util.Date;

public class Paciente {
    private int id;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String dni;
    private Date FechaAlta;

    public Paciente(int id, String nombre, String apellido, String domicilio, String dni, Date fechaAlta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.FechaAlta = fechaAlta;
    }

    // metodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Date getFechaAlta() {
        return FechaAlta;
    }
    public void setFechaAlta(Date fechaAlta) {
        this.FechaAlta = fechaAlta;
    }



}
