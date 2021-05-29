package arrayDemo;

public class DoubleArray {

	public static void main(String[] args) {
		
		String name[][] = new String[2][3];
		
		name[0][0] = "Sayan";
		name[0][1] = "Kajari";
		name[0][2] = "Arpit";
		name[1][0] = "Aparna";
		name[1][1] = "Asif";
		name[1][2] = "Anshuman";

		System.out.println(name.length);
		
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j <= name.length; j++) {
				System.out.println(name[i][j]);
			}
		}
	
	}

}
