# hunterset65
import java.io.*;
import java.util.*;
import java.lang.*;
public class hunterset65{
  public static void main(String[] args) {
  
int a[]=new int[20];
int last[]=new int[20];
int n;
    int x=0;
Scanner s=new Scanner(System.in);
System.out.println("enter n of values");
n=s.nextInt();
System.out.println("enter array elements in integer:");
for(int i=0;i<n;i++)
{
  a[i]=s.nextInt();
}
int remove;
System.out.println("enter element to be removed elements:");
remove=s.nextInt();

for(int i=0;i<n;i++)
{
  if(a[i]!=remove)
    last[x++]=a[i];
}
System.out.println("NEW array");
for(int i=0;i<x;i++)
{
  System.out.print(last[i]+" ");
}
}
}
