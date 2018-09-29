package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import myapp.Fraction;
import myapp.Calc;
import myapp.Create;
import myapp.Expression;
class Test1 {

	@Test
	void test() throws IOException {
		Expression e=new Expression();
		Calc c=new Calc();
		List<String> list;
		for (int i=0;i<100;i++) {
		String str=e.getexp(10);
		System.out.println(str);
		list=c.Stringtolist(str);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		}
		
		}
	}


