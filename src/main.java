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
		
		
		System.out.println("done");

	}

}
