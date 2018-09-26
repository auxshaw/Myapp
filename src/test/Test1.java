package test;

import java.io.IOException;
import org.junit.jupiter.api.Test;

import myapp.Fraction;
import myapp.Expression;
class Test1 {

	@Test
	void test() throws IOException {
		Expression c = new Expression();
		String[] result= new String[3];
		for(int i=0;i<10000;i++) {  
		Fraction f1=c.fraction_create(10);
		Fraction f2=c.fraction_create(10);
		char sign=c.operator_create();
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
		case '¡Á':
			result[0]=f1+" ¡Á "+f2;
			result[1]=f1.mult(f2).toString();
			break;
		case '¡Â':
			while(f2.isZero()) {
				f2=c.fraction_create(10);
			}
			result[0]=f1+" ¡Â "+f2;
			result[1]=f1.div(f2).toString();
			break;
		}
		System.out.println(i+1+"."+result[0]+","+result[1]);
		}
		
        	
        }
	}


