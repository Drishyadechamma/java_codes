package com.training.day1;
class Internet
{
	void Coonetion(boolean b) throws MyOwnException_I,NullPointerException,ArrayIndexOutOfBoundsException
	{
		int a[]= {1234,45};
		System.out.println(a[100]);
		String name_brandband=null;
		System.out.println(name_brandband.charAt(3));
		
		if(b==true)
		{
			System.out.println("connecting....");
		}
		else
		{
			throw new MyOwnException_I("Internet not connecting..");
		}
	}
}

public class CustomException {
	public static void main(String[] args) {
		Internet i =new Internet();
		try
		{
			i.Coonetion(true);
		}catch(MyOwnException_I x)
		{
			System.err.println(x.getMess());
		}catch (NullPointerException e) {
			System.out.println("no name added broadband");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array exception handled");
		}
		
	}

}
