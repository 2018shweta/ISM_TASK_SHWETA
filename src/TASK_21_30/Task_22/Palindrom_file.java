package TASK_21_30.Task_22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Palindrom_file {
	public static void main(String args[]) throws IOException
    {
    	Scanner sc=new Scanner(System.in);
   File f=new File("name.txt");
    	File pf=new File("palindrome.txt");
    	System.out.println(f.getAbsolutePath());
    	//BufferedWriter bw=new BufferedWriter(new FileWriter(f));
    	PrintWriter bw =new PrintWriter(f);
    	PrintWriter pw=new PrintWriter(pf);
    	BufferedReader br=new BufferedReader(new FileReader(f));
    	System.out.println("Enter the how many number you want to store?");
    	int num=sc.nextInt();
    	for(int i=1;i<=num;i++)
    	{
    		System.out.println("Enter the name :");
    		String name=sc.next();
    		bw.println(name);
    	}
    	//bw.close();
    	
    	while(true)
    	{
    		
    		String name1=br.readLine();
    		if(name1==null)
    		{
    			break;
    		}
    		System.out.println(name1);
    		StringBuilder name = new StringBuilder(name1);
			StringBuilder j = name.reverse();

    		//System.out.println(j);
    	
    		
    		if(name1.contentEquals(j)) {
    			pw.println(j);
    			System.out.println("name1"+name1);
    		}
    	}
    	
//    	f.close();
//    	pf.close();
    	//bw.close();  
    	pw.close();
    }
}
