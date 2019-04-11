package com.rl.singleton;

public class SIngletonDemo2 {
  public static void main(String[] args)
  {
	  Singleton sin= Singleton.getInstance();
	  System.out.println(sin);
	  Singleton sin1= Singleton.getInstance();
	  System.out.println(sin1);//the same with sin
  }
}
class Singleton{
	private static final Singleton instance=new Singleton() ;
	/*private constructor*/
	private Singleton() {}
	public static Singleton getInstance()
	{
		return instance;
	}
}
