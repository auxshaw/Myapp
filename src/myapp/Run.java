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
		System.out.println("-r ��Ŀ����ֵ���ò�����������Ϊ1��������Ȼ����");
		System.out.println("-n ��Ŀ��ֵ���ò�����������Ϊ1��������Ȼ����");
		System.out.println("����'-r 10 -n 10'��'-n 10 -r 10'");
		while(scan.hasNextLine()) {
			if (scan.hasNextLine()) {
		        command = scan.nextLine();}    		   
		
		//��������Ƿ���ȷ
		Pattern pa = Pattern.compile("^\\-n\\s+\\d+\\s+\\-r\\s+\\d+$||^\\-r\\s+\\d+\\s+\\-n\\s+\\d+$");
        Matcher ma = pa.matcher(command); 
        if(!ma.matches()) {
        	System.out.println("�����ʽ��������������");
        	continue;
        }
        //��������зָ�
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
		//����
		n=0;
		r=0;
		}
		
		
	}

}
