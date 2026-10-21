//code is running fine for lowercase string
import java.util.Scanner;
class code{
	String s;
	String encode="";	//think it as sum=0 and sum = sum + i
	String decode="";	//same as first
	int key = 88;	//taking encryption key
	void getdata(){	//taking input from user
	System.out.println("Enter your text to encode: ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();	//nextLine() for long string
	}
	void encoder(){
		for(int i = 0; i < s.length(); i++){
			encode = encode + (char)(s.charAt(i) ^ key);	//X-ORing the string characters with our key then concetanate each character inside encode
		}
	}
	void decoder(){
		for(int i = 0 ; i < s.length(); i++){
			decode = decode + (char)(encode.charAt(i) ^ key);	//X-ORing again to recover encoded data from the coded message
		}
	}
	void showMsg(){		//display methods next 3 methods
		System.out.println(s);
	}
	void showEnc(){
		System.out.println(encode);
	}
	void showDec(){
		System.out.println(decode);
	}
}
class enc_dec{
	public static void main(String[] args){
		code ED = new code();
		ED.getdata();
		System.out.println("Before encoding: ");
		ED.showMsg();
		ED.encoder();
		System.out.println("After encoding: ");
		ED.showEnc();
		System.out.println("After decoding: ");
		ED.decoder();
		ED.showDec();
	}
}
