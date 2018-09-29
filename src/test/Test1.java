package test;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import myapp.Checkanswer;
import myapp.Create;
class Test1 {
	//D:\JAVAEXP\PROJ\Myapp\
	@Test
	void test() throws IOException {
		Create create=new Create();
		create.cr(10000, 10);
		Checkanswer c=new Checkanswer(); 
		c.check("D:\\myanswer.txt", "D:\\Answers.txt");
	}
}

