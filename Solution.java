import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(String opr) {
		
		
		
		String a[]=opr.split("");
		int i=0;
		int j=0;
		int num1[];
		String aaa[]=new String[100];
		int flage=0;
		String x1="";
		String x2="";
		String plus="+";
		String mns="-";
		String sign="";
		
		
		for(i=0;i<a.length;i++)
		{
			
			
			if(	(	!(a[i].equals(plus))	&&	!(a[i].equals(mns))	)  && flage==0	)
			{
				x1=x1+a[i];
			}
			
			if(	(	!(a[i].equals(plus))	||	!(a[i].equals(mns))	)  && flage==1	)
			{
				x2=x2+a[i];
			}
			
			
			
			
			
			
			if(a[i].equals(plus) || a[i].equals(mns))
			{
				sign=a[i];
				flage=1;
			}
			
			
		}
		
			
		
		
		
		int x=Integer.parseInt(x1);
		int y=Integer.parseInt(x2);
		int ans=0;
		if(x>=0 && y<=9  )
		{
			if(sign.equals("+"))
			{
				ans=x+y;
			}
			if(sign.equals("-"))
			{
				ans=x-y;
			}
			
		}
		else
		{
			System.out.println("Constraints not match based on your input(x must be >=0 and y<=0)");
		}
		
		return ans;
		}
		
		
		
		/*
		while(i!=a.length)
		{
			if(a[i]!="+" && flage)
			{
			  	num1[j]=Integer.parseInt(a[i]);
				j++;
			}
			i++;
		}
		
		*/
		
		
		
		//int x=Integer.parseInt(a[0]);
		//int y=Integer.parseInt(a[2]);
		//int ans=0;
		//if(a[1].equals("+"))
		//{
		//	ans=x+y;
	//		
		//}
		
	//	if(a[1].equals("-"))
	//	{
	//		ans=x-y;
	//	}
		
        // Complete this function
		//char a1[]=opr.toCharArray();
		//int x=Integer.parseInt(a1[0]);
		//int y=a1[1];
		
		
		
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
