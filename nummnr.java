package nummnr;

import java.util.Scanner;

public class nummnr {

		static int nummenor(int n1, int n2)
		{
		     if (n1<n2)
		     {
		     System.out.print("El numero menor es: ");
		     return n1;
		     } 
		     else if (n2<n1) 
		     {
		     System.out.print("El numero menor es: ");
		     return n2;
		     }else
		     {
		     System.out.print("Los numeros son Iguales");
		     return 0;
		     }
		      }
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner s = new Scanner (System.in);
			  System.out.print("Ingrese primer valor: ");
			  int n1= s.nextInt();
			  System.out.print("Ingrese segundo valor: ");
			  int n2= s.nextInt();
			  System.out.print(nummenor(n1,n2));

		}
}
