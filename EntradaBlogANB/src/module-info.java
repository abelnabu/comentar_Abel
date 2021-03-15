
/**Modificar.
 * Clase para manejar las entradas de un blog
 * @version 2.3
 * @author abeln
 * Fecha 15/03/21
 */
public class EntradaBlogANB {
	/**separador es el ccarácter que separa ENTRADA DE del
	*nombre del autor
	*/
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Constructor de la clase. Recibe el número de entrada, el nombre del autor
	 * de la entrada y el texto que contiene la entrada. Si el número de entrada
	 * es negativo, lanza una excepción.
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public EntradaBlog(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	/**
	 * @Override
	 * @return cad
	 */
	
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Devuelve el número de la entrada
	 * @return id
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Devuelve el texto completo de la entrada
	 * @return Texto
	 */
	public String getTexto(){
		return this.texto;
	}
	
	
	/**
	 * Devuelve el nombre del autor de la entrada en mayúsculas
	 * @return nombre en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	//
	/**
	 * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 * @return nombre del autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	
	/**
	 * No tiene porqué tener argumentos.
	 * @param args
	 */
	public static void main(String[] args) {
               
		EntradaBlogANB e1=new EntradaBlogANB (-3,"Abel Navarro","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}