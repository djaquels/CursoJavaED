class AvicciReto {
	public static void main(String[] args ){
		/*
		 *     * *****
		 *    ** ****
		 *   *** ***
		 *  **** **
		 * ***** *   Reto imprimir el logo de Avicci en consola
		 *  
		 */
	     int dim = 6;
		 int filas,columnas;
		 for(filas = 0; filas < dim-1; filas++){
			 for(columnas=0; columnas < 11; columnas++){
			   if(columnas == 5){
				   System.out.print("  ");
			   } else{
				   if(10 <= (6 + columnas + filas)){
					if ((6+columnas+filas) < 17){
						System.out.print("*");
					}
				   }else{
					System.out.print(" ");
				   }

			   }
			 }
			 System.out.println("");
		 }
	}
}
