package commons;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class DetalleTurnoDTO implements Serializable 
{

	private static final long serialVersionUID = -379017126622874631L;

	private Long id;
	private BigInteger idTurno;
	private int idDia;
	private Long idDetalleHorario;
	private Date FechaInicio;
	private Date FechaFin;
	private String Dia;

	
	
	public DetalleTurnoDTO(BigInteger idTurno, 
						  int idDia, 
						  Long idDetalleHorario, 
						  Date fechaInicio, 
						  Date fechaFin,
						  String dia)
	{
		super();
		this.idTurno = idTurno;
		this.idDia = idDia;
		this.idDetalleHorario = idDetalleHorario;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
		Dia = dia;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigInteger getIdTurno() {
		return idTurno;
	}
	public void setIdTurno(BigInteger idTurno) {
		this.idTurno = idTurno;
	}
	public int getIdDia() {
		return idDia;
	}
	public void setIdDia(int idDia) {
		this.idDia = idDia;
	}
	public Long getIdDetalleHorario() {
		return idDetalleHorario;
	}
	public void setIdDetalleHorario(Long idDetalleHorario) {
		this.idDetalleHorario = idDetalleHorario;
	}
	public Date getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		FechaFin = fechaFin;
	}
	public String getDia() {
		return Dia;
	}
	public void setDia(String dia) {
		Dia = dia;
	}

}
