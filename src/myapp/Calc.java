package myapp;

import java.util.ArrayList;
import java.util.List;

public class Calc {
	char[] OP= {'+','-','×','÷','(',')'};
	
	//判断是否是操作符
	public boolean isoper(char c) {
		for(int i=0;i<OP.length;i++) {
			if(OP[i]==c) return true;
		}
		return false;
	}
	
	//判断是否是数字
	public boolean isfra(char c) {
		if(c>='0'&&c<='9') 
			{return true;}
		return false;
	}
	public boolean isfraop(char c) {
		if(c=='\''||c=='/') {
			return true;
		}
		return false;
	}
	
	//将Stirng类型表达式转换成List<String>类型
	public List<String> Stringtolist(String str){
		List<String> list = new ArrayList<String>();
		str.replace(" ", "");
		char op;
		String temp="";
		for(int i=0;i<str.length();i++) {
			op=str.charAt(i);
		if(isfra(op)||isfraop(op)) {
			temp+=op;
		} else if(isoper(op)) {
			if(!temp.isEmpty()) {
				list.add(temp);
				temp="";
			}
			list.add(op+"");
		}		
		}
		if(!temp.isEmpty()) {
			list.add(temp);
			temp="";
		}
		return list;
	}
	
	//将中缀表达式转换为后缀表达式
	 
	
}
