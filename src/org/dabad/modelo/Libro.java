package org.dabad.modelo;
public class Libro {
	//fase de declaración de variables
	private int idLibro;
	private String nombreDelLibro;
	private String nombreDelAutor;
	private String nombreDeLaEditorial;
	private int edicion;
	private boolean estado_activo;
        
	//fase de declaración y definición de los métodos
	public Libro() {}
	
	public Libro(int idLibro, String nombreLibro, String nombreAutor, String nombreEditorial, int edicion, boolean estado_activo) {
		this.idLibro = idLibro;
                this.nombreDelLibro = nombreLibro;
		this.nombreDelAutor = nombreAutor;
		this.nombreDeLaEditorial = nombreEditorial;
		this.edicion = edicion;
                this.estado_activo = estado_activo;
	}
	
	public int getIdLibro(){
		return idLibro;
	}
	
	public void setIdLibro(int id){
		this.idLibro = id;
	}
	
	public String getNombreDelLibro() {
		return nombreDelLibro;
	}
	
	public void setNombreDelLibro(String nombreLibro) {
		this.nombreDelLibro = nombreLibro;
	}
	
	public String getNombreDelAutor(){
		return nombreDelAutor;
	}
	
	public void setNombreDelAutor(String nombreAutor){
		this.nombreDelAutor = nombreAutor;
	}
	
	public String getNombreDeLaEditorial(){
		return nombreDeLaEditorial;
	}
	
	public void setNombreDeLaEditorial(String nombreEditorial){
		this.nombreDeLaEditorial = nombreEditorial;
	}
	
	public int getEdicion(){
		return edicion;
	}
	
	public void setEdicion(int edicion){
		this.edicion = edicion;
	}
        
        public boolean getEstado(){
            return estado_activo;
        }
        
        public void setEstado(boolean estado_activo){
            this.estado_activo = estado_activo;
        }
}