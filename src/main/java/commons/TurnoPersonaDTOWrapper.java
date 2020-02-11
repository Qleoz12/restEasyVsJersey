package commons;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TurnoPersonaDTOWrapper implements Serializable {
	
	private static final long serialVersionUID = -99117126622873931L;
	
	
	//request
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	//respuesta
	String Error;
	//obligatorios
	private Long idPYZ;
	private Long entidadselecciona;
	private Long entidadlogueada;
	private Long opcion;
	private String usuario;
	
	private List<TurnoPersonaDTO> lista;
	
	public Long getEntidadselecciona() {
		return entidadselecciona;
	}
	public void setEntidadselecciona(Long entidadselecciona) {
		this.entidadselecciona = entidadselecciona;
	}
	public Long getEntidadlogueada() {
		return entidadlogueada;
	}
	public void setEntidadlogueada(Long entidadlogueada) {
		this.entidadlogueada = entidadlogueada;
	}
	public Long getOpcion() {
		return opcion;
	}
	public void setOpcion(Long opcion) {
		this.opcion = opcion;
	}
	
	public List<TurnoPersonaDTO> getLista() {
		return lista;
	}
	public void setLista(List<TurnoPersonaDTO> lista) {
		this.lista = lista;
	}
	
	public Long getIdPYZ() {
		return idPYZ;
	}
	public void setIdPYZ(Long idPYZ) {
		this.idPYZ = idPYZ;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getError() {
		return Error;
	}
	public void setError(String error) {
		Error = error;
	}
	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDateTime getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
}
