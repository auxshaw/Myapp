package myapp;

import java.io.*;


public class Create {
	//在当前目录下生成练习题和答案
	
	public void cr() throws IOException {
		BufferedWriter btex=new BufferedWriter(new FileWriter(".\\Exercises.txt"));
		BufferedWriter btan=new BufferedWriter(new FileWriter(".\\Answers.txt"));
		//for(){}
		String exercises=null;
		String answers=null;
		btex.write(exercises);
		btan.write(answers);
		btex.flush();
		btan.flush();
		btex.close();
		btan.close();
	}
	
}
