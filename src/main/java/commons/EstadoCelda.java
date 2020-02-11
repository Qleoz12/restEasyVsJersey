package commons;

public enum EstadoCelda {

	Reservado(4),
	EnUso(5),
	Disponible(6)
	;
	
	EstadoCelda(Integer id){
		this.id=id;
	}
	
	private Integer id;
	
	public Integer getId(){
		return id;
	}
	
}
