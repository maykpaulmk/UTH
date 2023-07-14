package hn.clinica.data.entity;

import jakarta.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Citas extends AbstractEntity {

    private String idcita;
    private LocalDateTime fecha;
    private String paciente;
    private String direccion;
    private String telefono;
    private String detalle;

    public String getIdcita() {
        return idcita;
    }
    public void setIdcita(String idcita) {
        this.idcita = idcita;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
  
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
