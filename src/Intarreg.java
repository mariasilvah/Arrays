
public class Intarreg {

	//1
	public static int[]quinct(int[]myquinc){
		int[]myqt={2, 5, 9, 54, 73, 22, 56, 25, 24, 65, 52, 51, 16, 13, 23};
		//int[]myqt=myquinc;
		myqt[9]=5;
	return myqt;	
	}
	//2
	public static String[]arrnom(String []veinom){
		String[]vn= {"Luis", "Amado", "Luis","Lina","Paula","Majo", "Erick","Fer", "Cris", "Nat",
				"Flavia", "Laura", "Peter", "Yeny", "Martin", "Oscar", "Jose", "Beto", "Toñito","Marko"};
		vn[0]="Francisco";
	return vn;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		int[]myquinc= new int[14];
		int[]myquin=quinct(myquinc);
		//int[]myqt=myquinc;
		for(int p=0; p<=myquinc.length; p++) {
			//int[]myqt=myquinc;
			System.out.println(myquin[p]);
		}		//int[]minct=myquinc;
		//2
		String[]veinom=new String[19];
		String[]nv=arrnom(veinom);
		for(int q=0; q<=veinom.length; q++) {
			System.out.println(nv[q]);
		}
	}

}
