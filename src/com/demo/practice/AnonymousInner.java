package com.demo.practice;

public class AnonymousInner {

	public static void main(String[] args) {
 
		// Anonymous inner class
//		Runnable r1=new Runnable()
//				{
//					@Override
//					public void run() {
//						System.out.println("Implementation class using anonymous (Child Thread) ");
//					}
//				};
		
		Runnable r = () -> {
			System.out.println("Implementation class using anonymous (Child Thread)");
			};
				Thread t1=new Thread(r);
				t1.start();
				
				for(int i=0;i<5;i++) {
					System.out.println("Main thread");
				}
				
				
	}

}
