package arrayDemo;

public class DoubleArray {

	public static void main(String[] args) {
		
		String name[][] = new String[2][3];
		
		name[0][0] = "Ornika";
		name[0][1] = "Paromita";
		name[0][2] = "Annwesha";
		name[1][0] = "Debatama";
		name[1][1] = "Ankita";
		name[1][2] = "Madhumanti";
	
		System.out.println("The name is "+name[0][2]);
	
	}

}
