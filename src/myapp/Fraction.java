package myapp;

public class Fraction {
	//����
	private int a;
	//��ĸ
	private int b;
	 
	 //����
	 public Fraction(int a, int b) {
		 this.a = a;
	        if (b == 0) {
	            throw new ArithmeticException("��ĸ����Ϊ��");
	        } else {
	            this.b = b;
	        }
	        simple();
	 }
	 
	//����
	 private Fraction simple() {
		    int gcd = this.gcd(this.a, this.b);
	        this.a /= gcd;
	        this.b /= gcd;
	        return this;
	 }
	 
	 //���Լ��
	 private int gcd(int a, int b) {
	        int mod = a % b;
	        if (mod == 0) {
	            return b;
	        } else {
	            return gcd(b, mod);
	        }
	    }

	 //��������
	    public Fraction add(Fraction second) {//�ӷ�
	        return new Fraction(this.a * second.b + second.a * this.b,
	                this.b * second.b);
	    }

	    public Fraction sub(Fraction second) {//����
	        return new Fraction(this.a * second.b - second.a * this.b,
	                this.b * second.b);
	    }

	    public Fraction mult(Fraction second) {//�˷�
	        return new Fraction(this.a*second.a,
	                this.b * second.b);
	    }

	    public Fraction div(Fraction second) {//����
	        return new Fraction(this.a*second.b,
	                this.b * second.a);
	    }
	    
	    
	    //������ת�ַ�������
	    public String toString() {
	    	if (this.b==1) {
	    		return String.valueOf(a);
	    	}
	    	else if(this.a>this.b) {
	    		int c=0;
	    		c=this.a/this.b;
	    		this.a=this.a%this.b;
	    		return String.valueOf(c)+"'"+String.valueOf(a)+"/"+String.valueOf(b);
	    	} 
	    	else{
	        return String.valueOf(a)+"/"+String.valueOf(b);}
	    }
	    
	    //�Ƚϴ�С,�Ƚϴ˷����Ƿ�����������
	    public boolean isgreaterthan2(Fraction f) {
	    	int z=this.a * f.b - f.a * this.b;
	    	if(z>0) {return true;}
	    	else return false;
	    }
	    public boolean isZero() {
	        return a == 0;
	    }
	    
}
