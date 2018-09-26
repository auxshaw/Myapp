package myapp;

import java.util.Random;

public class Expression {
	Random random=new Random();
	


	
	//数值范围	
	public Fraction fraction_create(int r) {
		int choose=random.nextInt(4)+1;
		int denominator=1;
		int numerator=0;
		if(choose==1) { //整数
			numerator=random.nextInt(r);
			denominator=1;		
		}else {
		denominator=random.nextInt(r)+1;
		numerator=random.nextInt(r*r+1);
		while(numerator/denominator>=r) {
			denominator=random.nextInt(r)+1;
			numerator=random.nextInt(r+1);}		
		}
		return new Fraction( numerator , denominator );	
	}
	//随机生成运算符
	public char operator_create() {
		int oper=random.nextInt(4);    
		char sign;
		switch (oper) {
		case 0:
			sign='+';			
			break;
		case 1:
			sign='-';
			break;
		case 2:
			sign='×';
			break;
		case 3:
			sign='÷';
			break;
		default:
			sign='+';
		}
		return sign;
	}
	
	//result[0] 存放生成的表达式，result[1]存放计算结果，result[2]存放查重表达式
	public String[] one_oper_expression(int r) {
		String[] result= new String[3];
		Fraction f1=fraction_create(r);
		Fraction f2=fraction_create(r);	
		char sign=operator_create();
		switch(sign) {
		case '+':
			result[0]=f1+" + "+f2;
			result[1]=f1.add(f2).toString();			
			break;
		case '-':
			if(!f1.isgreaterthan2(f2)) {
				Fraction temp;
				temp=f1;f1=f2;f2=temp;
			}
			result[1]=f1.sub(f2).toString();
			result[0]=f1+" - "+f2;
			break;
		case '×':
			result[0]=f1+" × "+f2;
			result[1]=f1.mult(f2).toString();
			break;
		case '÷':
			while(f2.isZero()) {
				f2=fraction_create(r);
			}
			result[0]=f1+" ÷ "+f2;
			result[1]=f1.div(f2).toString();
			break;
		}
		System.out.println(result[0]+","+result[1]);
		return result;
		
	}
	
	
	
}
