class ovload{
	void f(int x){
		System.out.println("Inside f(int): " + x);
	}
	void f(double x){
		System.out.println("Inside f(double): " + x);
	}
	void f(byte x){
		System.out.println("Inside f(byte): " + x);
	}
}

class TypeConv{
	public static void main(String[] args){
		ovload ob = new ovload();
		//taking inputs of each datatype
		int i = 100;
		double d = 10.578;
		float f = 19.54f;
		byte b = 9;
		short s = 2;

		ob.f(i);
		ob.f(d);
		ob.f(f);
		ob.f(b);
		ob.f(s);
	}
}
