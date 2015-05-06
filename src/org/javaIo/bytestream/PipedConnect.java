package org.javaIo.bytestream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


class Sender extends Thread{
	private PipedOutputStream po;
	
	public PipedOutputStream getPo() {
		return po;
	}


	public Sender(String name) {
		super(name);
		this.po=new PipedOutputStream();
	}

	@Override
	public void run() {
		
		byte content[] ="you simle in my heart.it will go after sky touch group".getBytes();
		
		try {
			po.write(content);
			System.out.println(Thread.currentThread().getName()+"  send letter!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}

class Recevier extends Thread{
	
	public PipedInputStream getPi() {
		return pi;
	}
	final static int LEN=20;
	private PipedInputStream pi;
	public Recevier(String name){
		super(name);
		pi=new PipedInputStream();
	}
	@Override
	public void run() {
		readOnece();
	}
	private void readOnece(){
		
		byte result[] =new byte[LEN];
		try {
			Thread.sleep(500);
			System.out.println(new String(result,0,pi.read(result)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}

public class PipedConnect {

	public static void main(String[] args) throws Exception {
		Sender t1=new Sender("sen1");
		Recevier t2=new Recevier("REc1");
		Thread t3=new Recevier("REc1");
		t1.getPo().connect(t2.getPi());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(100);
		System.out.println(t1.getState());
		t2.start();
	}
	
	
}
