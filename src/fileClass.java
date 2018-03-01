

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class fileClass {

	public String CurrentDir = System.getProperty("user.dir");
	
	public void createTextFile(String fileName , String path) {
		
			String fname= path + File.separator + fileName +".txt";
		    File f = new File(path);
		    File f1 = new File(fname);

		    f.mkdirs();
		    try {
		        f1.createNewFile();
		    } catch (IOException e) {}
	}
	
	public void writeToTextFile(String fileName , String addedText , String path) {
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		//: Gets the path
		String fname= path + File.separator + fileName +".txt";

		try {
				
			//: Writes to the file
			fw = new FileWriter(fname);
			bw = new BufferedWriter(fw);
			bw.write(addedText);

		} catch (IOException e) {} finally {

			try {
				// closes the writers
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {}

		}	
		
	}
	
	public ArrayList<String> readFromTextFile(String fileName , String path) {
	
		BufferedReader br = null;
		FileReader fr = null;

		//: Gets the path
		String fname = path + File.separator + fileName +".txt";
		
		ArrayList<String> output = new ArrayList<String>();
		
		try {
	
			fr = new FileReader(fname);
			br = new BufferedReader(fr);

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				output.add(sCurrentLine);
			}

		} catch (IOException e) {} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {}

		}
		
		return output;
	}
	
	public void createFolder(String folderName , String path) {
		try {
			new File(path + "/" + folderName).mkdir();
		} catch (Exception e) {}
	}
	
	public void openExplorerWindow(String path) {
		try {
			Desktop.getDesktop().open(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
	
