package commons;

import java.io.Serializable;

public class ClienteDTO  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idCliente;

	private Long idEntidad;

	private String identificacion;

	private String login;
	
	private String externalLogin;
	
	private String nombre;

	private String estado;

	public ClienteDTO() {
		super();
	}

	public ClienteDTO(Long idCliente, Long idEntidad, String login, String externalLogin, String nombre,String identificacion,String estado) {
		super();
		this.idCliente = idCliente;
		this.identificacion=identificacion;
		this.idEntidad = idEntidad;
		this.login = login;
		this.externalLogin = externalLogin;
		this.nombre = nombre;
		this.estado = estado;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getExternalLogin() {
		return externalLogin;
	}

	public void setExternalLogin(String externalLogin) {
		this.externalLogin = externalLogin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(Long idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

}
