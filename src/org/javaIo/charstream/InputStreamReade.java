package org.javaIo.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class InputStreamReade {
	static String filePath="src/org/javaIo/charstream/char.txt";
	static String charSetName="utf-8";
	public static void main(String[] args) throws Exception {
		
		OutputStreamWriter fw=new OutputStreamWriter(new FileOutputStream(new File(filePath)),charSetName);
		fw.write("À­µ¹");
		fw.flush();
		fw.close();

	}
	

}	
