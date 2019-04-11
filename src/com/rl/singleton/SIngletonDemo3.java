package com.rl.singleton;

public class SIngletonDemo3{
	public static void main(String[] args)
	{
		singleton1 sin=singleton1.getInstance();
		System.out.println(sin);
		singleton1 sin1=singleton1.getInstance();
		System.out.println(sin1);//the same with sin
	}
}

class singleton1 {
	   private static singleton1 instance=null;
	   private singleton1() {}
	   public static singleton1 getInstance()
	   {
		   if(instance==null)
		   {
			   instance=new singleton1();
		   }
		   return instance;
	   }
	}
	
