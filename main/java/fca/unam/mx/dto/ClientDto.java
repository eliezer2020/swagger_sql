package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String nombre;
    private String apellido_paterno;
     private String apellido_materno;
     private String rfc;
//ID
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

//NOMBRE

    @ColumnName("nombre")
    public String getNombre() {
        return nombre;
    }
     public void setNombre(String name) {
        this.nombre = name;
    }
//paterno

    @ColumnName("apellido_paterno")
    public String getPaterno() {
        return apellido_paterno;
    }
     public void setPaterno(String name) {
        this.apellido_paterno = name;
    }

//materno

    @ColumnName("apellido_materno")
    public String getMaterno() {
        return apellido_materno;
    }
     public void setMaterno(String name) {
        this.apellido_materno = name;
    }


    //rfc
    public String getrfc() {
        return rfc;
    }
    public void setrfc(String id) {
        this.rfc = id;
    }

    

  



}
