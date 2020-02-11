package commons;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class TurnoPersonaDTO implements Serializable {

	private static final long serialVersionUID = -379017126622873931L;

	private Long id;
	private BigInteger idTurno;
	private String NombreTurno;
	private Long idEntidadLogueada;
	private Long idPersona;
	private Long idOpcion;

	private Date created;
	private String createdBy;

	private Date updated;
	private String updatedBy;

	public String getNombreTurno() {
		return NombreTurno;
	}

	public void setNombreTurno(String nombreTurno) {
		NombreTurno = nombreTurno;
	}

	public TurnoPersonaDTO() {
		super();
	}

	public TurnoPersonaDTO(Long id) {
		super();
		this.id = id;
	}

	public TurnoPersonaDTO(Long id, BigInteger idTurno, String nombreTurno, Long idEntidadLogueada, Long idPersona,
			Long idOpcion, Date created, String createdBy, Date updated, String updatedBy) {
		super();
		this.id = id;
		this.idTurno = idTurno;
		this.NombreTurno = nombreTurno;
		this.idEntidadLogueada = idEntidadLogueada;
		this.idPersona = idPersona;
		this.idOpcion = idOpcion;
		this.created = created;
		this.createdBy = createdBy;
		this.updated = updated;
		this.updatedBy = updatedBy;
	}

	public TurnoPersonaDTO(Long id, BigInteger idTurno, String nombreTurno, Long idEntidadLogueada, Long idPersona,
			Long idOpcion,String createdBy, String updatedBy)
	{
		super();
		this.id = id;
		this.idTurno = idTurno;
		this.NombreTurno = nombreTurno;
		this.idEntidadLogueada = idEntidadLogueada;
		this.idPersona = idPersona;
		this.idOpcion = idOpcion;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdEntidadLogueada() {
		return idEntidadLogueada;
	}

	public void setIdEntidadLogueada(Long idEntidadLogueada) {
		this.idEntidadLogueada = idEntidadLogueada;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Long getIdOpcion() {
		return idOpcion;
	}

	public void setIdOpcion(Long idOpcion) {
		this.idOpcion = idOpcion;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public BigInteger getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(BigInteger idTurno) {
		this.idTurno = idTurno;
	}

}
