import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
	
		fileClass file = new fileClass();
		
		
		ArrayList<String> textArrayFromfile =  file.readFromTextFile("a_example", file.CurrentDir);
		ArrayList<Integer[]> intArray = new ArrayList<Integer[]>();
		
		
		for (String textField : textArrayFromfile) {
			
			char[] charfield = textField.toCharArray();
			Integer[] tempOfTemps = new Integer[charfield.length];
			String temp = "";
			
			for(int i = 0; i < charfield.length; i++) {
				
				if(charfield[i] != ' ') {
					temp += charfield[i];
				}else {
					int toInt = Integer.valueOf(temp);
					tempOfTemps[i] = toInt;
					temp = "";
				}
	
			}
			
			if(temp != "") {
				int toInt = Integer.valueOf(temp);
				tempOfTemps[charfield.length - 1] = toInt;
				temp = "";
			}
			
			intArray.add(tempOfTemps);
		}
		
		int rows = 0;
		int collums = 0;
		int vehicles = 0;
		int rides = 0;
		int bonus = 0;
		int steps = 0;
		

		int constuctionIndex = 1;
		Integer[] setup = intArray.get(0);
		for(int i = 0; i < setup.length; i++) {
			
			if(setup[i] != null) {
				
				if(constuctionIndex == 1) {
					rows = setup[i];
				}else if(constuctionIndex == 2) {
					collums = setup[i];
				}else if(constuctionIndex == 3) {
					vehicles = setup[i];
				}else if(constuctionIndex == 4) {
					rides = setup[i];
				}else if(constuctionIndex == 5) {
					bonus = setup[i];
				}else if(constuctionIndex == 6) {
					steps = setup[i];
				}
				
				constuctionIndex++;
			}
				
		}
		
		
		City city =  new City(rows , collums , vehicles);
		
		System.out.println("dones");
		
	}

}
