package myapp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String command=null;
		int n = 0;
		int r = 0;
		System.out.println("-r 题目中数值（该参数可以设置为1或其他自然数）");
		System.out.println("-n 题目个值（该参数可以设置为1或其他自然数）");
		System.out.println("例：'-r 10 -n 10'或'-n 10 -r 10'");
		while(scan.hasNextLine()) {
			if (scan.hasNextLine()) {
		        command = scan.nextLine();}    		   
		
		//检查命令是否正确
		Pattern pa = Pattern.compile("^\\-n\\s+\\d+\\s+\\-r\\s+\\d+$||^\\-r\\s+\\d+\\s+\\-n\\s+\\d+$");
        Matcher ma = pa.matcher(command); 
        if(!ma.matches()) {
        	System.out.println("命令格式错误，请重新输入");
        	continue;
        }
        //对命令进行分割
		String[] c=command.split("\\s+");
		if(c[0].equals("-n")&&c[2].equals("-r")) {
			n=Integer.parseInt(c[1]);
			r=Integer.parseInt(c[3]);
		}
		else if(c[0].equals("-r")&&c[2].equals("-n")){
			r=Integer.parseInt(c[1]);
			n=Integer.parseInt(c[3]);
		}
		
		
		System.out.println(n);
		System.out.println(r);	
		//归零
		n=0;
		r=0;
		}
		
		
	}

}
