package com.formulario.formulario.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Cita {

    @NotEmpty(message = "El nombre no puede estar vacío.")
    private String nombre;

    @NotEmpty(message = "El apellido no puede estar vacío.")
    private String apellido;

    @NotNull(message = "La edad no puede ser nula.")
    private Integer edad; // Usamos Integer en lugar de int para permitir null

    @NotEmpty(message = "El género no puede estar vacío.")
    private String genero;

    @NotEmpty(message = "El tipo de sangre no puede estar vacío.")
    private String tipoSangre;

    @NotEmpty(message = "El DNI no puede estar vacío.")
    private String DNI;

    @NotEmpty(message = "El correo no puede estar vacío.")
    private String correo;

    @NotEmpty(message = "El teléfono no puede estar vacío.")
    private String telefono;

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public Integer getEdad() { return edad; }
    public void setEdad(Integer edad) { this.edad = edad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getTipoSangre() { return tipoSangre; }
    public void setTipoSangre(String tipoSangre) { this.tipoSangre = tipoSangre; }

    public String getDNI() { return DNI; }
    public void setDNI(String DNI) { this.DNI = DNI; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
