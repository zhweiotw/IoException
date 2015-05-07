package org.javaIo.bytestream;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class FileStream {
	static String filePath="src/org/javaIo/bytestream/words.txt";
	static String conten="she is beauty.and i like she.\n";
	final static int LEN=10;
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		PrintStream ps=new PrintStream(bos);
		ps.print("ackdk");
		FileOutputStream fos=new FileOutputStream(FileDescriptor.err);
		bos.writeTo(fos);
	}
	
}
