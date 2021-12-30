package package2;

import package1.MyPackage1BaseClass;

public class MyPackage2DerivedClass extends MyPackage1BaseClass
{
	public void myPackage2DervideClassMethod()
	{
		a=1;
		b=2;	//private can not be accessed
		c=3;
		d=4;	//default can not be accessed
	}
}
class MyPackage2OtherClass
{
	public void myPackage2OtherClassMethod()
	{
		MyPackage1BaseClass obj = new MyPackage1BaseClass();
		obj.a=1;
		obj.b=2; 	//private can not be accessed
		obj.c=3;	// Protected can not be accessed
		obj.d=4;	//default can not be accessed
	}
}