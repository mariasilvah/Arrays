import java.util.Arrays;
public class Estcla {
	public String n;
	public int semest;
	public int id;
	
	//3
	String[] estudiantes = new String[9];
	
	//para cuando es int o string
	
	//6 MOSTRAR ENTEROS
	public static int []mosint (int[]mi) {
		int []mic= {2, 5, 9, 54, 73, 22, 56, 25, 24, 65};
		//String e ="";
		//for (int r=0; r<=mi.length; r++) {
		//	e+=mi[r];
		//}
	return mic;
	}
	public static String moent(int[]mif) {
		String e="";
		for(int g=0; g<mif.length; g++) {
			e+=mif[g];
		}
	return e;
	}
	//7 BUSCAR ELEMENTO
	public static int buscint(int[]arrbus, int busq) {
		for (int z=0; z< arrbus.length; z++) {
			if(arrbus[z]==busq) {
				return z;
			}
		}
	return -1;
	}
	//8 Buscar valor, eliminar y mover todos de posicion 
	public static int []bemi(int[]arrocho, int eli) {
		int[]nuev = new int[arrocho.length-1];
		for(int t=0, tk=0; t<arrocho.length; t++) {
			if(t==eli) {
				continue;
			}
			nuev[tk++]=arrocho[t];
		}				
			//	nuev = new int[arrocho.length-1];
			//	for(int tn=0; tn<t; t++) {
			//		nuev[tn]=nuev[tn];
			//	}
			//	for(int )
			//}
		return nuev;
		
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		//6 MOSTRAR ENTEROS
		int[]mi= new int[9];
		int[]mik=mosint(mi);
		for(int s=0; s<=mi.length; s++) {
			System.out.println(mik[s]);
		}
		int[]mif= {65, 24, 25, 56, 22, 73, 54, 9, 5, 2};
		String v=moent(mif);
		System.out.println(v+"\n");
	//////////////////////////////////////
	//7 BUSCAR ELEMENTO
	int[]be= {78, 55, 10, 31, 59, 69, 32, 13, 18, 93};
	int see=31;
	System.out.println("Se busca"+see+"\n dentro de");
	for(int c=0; c<be.length; c++) {
		System.out.println(be[c]);
	}
	int w = buscint(be, see);
	if(w == -1) {
		System.out.println("El numero buscado no esta");
	}
	else {
		System.out.println("El numero buscado si esta y esta en la posicion "+w);
	}
	//////////////////////////////////////
	//8
	int[]arrocho= {98, 11, 32, 33, 15, 87, 42};
	int eli=2;
	arrocho = bemi(arrocho, eli);
	System.out.println(Arrays.toString(arrocho));
	}
}
