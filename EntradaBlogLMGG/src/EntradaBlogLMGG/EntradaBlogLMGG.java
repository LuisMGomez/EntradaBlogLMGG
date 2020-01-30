
package EntradaBlogLMGG;



/**
 * Clase para manejar las entradas de un blog.
 * 
 * @author Luis Manuel G�mez Gonz�lez
 * @version 2.4
 * @since 30/01/2020
 * 
 *
 */
public class EntradaBlogLMGG {

	/**
	 * separador es el car�cter que separa ENTRADA de del
	 * nombre del autor
	 * 		
	 */

		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		
		/**
		 * @param id Numero de entrada
		 * @param autor Nombre del autor de la entrada
		 * @param texto Texto que contiene la entrada
		 * @throws IllegalArgumentException Si el n�mero que recibe la entrada es negativo,
		 *  lanza una excepci�n
		 */

		public EntradaBlogLMGG(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * @return Devuelve el n�mero de la entrada
		 */
		
		public int getId(){
			return this.id;
		}
		
		/**
		 * @return Devuelve el texto completo de la entrada
		 */
		
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * @return Devuelve el nombre del autor de la entrada en may�sculas
		 */
		
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * @return Devuelve el nombre del autor. 
		 * @deprecated
		 * @see getAutor
		 */
		
		public String devuelveAutor(){
			return this.autor;
		}
		
		/**
		 * @param args No tiene porqu� tener argumentos.
		 */
	
		public static void main(String[] args) {
	                
			EntradaBlogLMGG e1=new EntradaBlogLMGG (3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
			System.out.println(e1);
		}
}
