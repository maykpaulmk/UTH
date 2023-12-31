package hn.clinica.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Pacientes extends AbstractEntity {

    private String nombre;
    private String identidad;
    private String telefono;
    private Integer edad;
    private String sangre;
    private Integer peso;
    private String altura;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentidad() {
        return identidad;
    }
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }
  
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getSangre() {
        return sangre;
    }
    public void setSangre(String sangre) {
        this.sangre = sangre;
    }
    public Integer getPeso() {
        return peso;
    }
    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}

	
}
