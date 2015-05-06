package org.javaIo;

import java.io.File;
import java.io.InputStream;

public class BReader {
public static void main(String[] args) {
	String str=args[0].toString();
	InputStream stream=BReader.class.getClassLoader().getResourceAsStream(str);
	File f=new File(str);
	System.out.println(f.getName());
	
}
}
