import java.util.*;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	int s=0;
	int u=0;
	int p=0;
	int q=0;
	for(int m=0;m<n;m++)
	{
	if(a[m]>0 && a[m]<50)
	{
	s=s+1;
	}
	else if((a[m]>49 && a[m]<70))
    {
	u=u+1;
	}
	else if(a[m]<90 && a[m]>69)
	{
	p=p+1;
	}
	else if(a[m]>89 && a[m]<100)
	{
	q=q+1;
	}
	}
	System.out.println("Number of students scored between 0 to 49 : "+s);
	System.out.println("Number of students scored between 50 to 69 : "+u);
	System.out.println("Number of students scored between 70 to 89 : "+p);
	System.out.println("Number of students scored between 90 to 100 : "+q);
	}
}