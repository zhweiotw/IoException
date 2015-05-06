package org.javaIo.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LByteArrayInputStream {
	
	static byte[] buffer="your simle in my head,never clean up.".getBytes();
	final static int LEN=8;
	public static void main(String[] args) throws IOException {
		InputStream ip=new ByteArrayInputStream(buffer);
		OutputStream op=new ByteArrayOutputStream();
		byte bu[]=new byte[LEN];
		int len;
		
		while((len=ip.read(bu))!=-1)
		{
			System.out.println(len+" : "+new String(bu,0,len));
			op.write(bu,0,len);
		}
			System.out.println(op.toString());	
	}
	
	

}
