import java.util.Scanner;

class StringOP{
	public static void main(String[] args){
		//int size;
		String str1 = "KOlkata is a city";
		String str2= new String(str1);	//assigning str2 = str1
		String str3 = "Special string";
		/*System.out.println("Enter the size of your string: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		str = new String[size];
		for(int i=0; i<size; i++){
			str[i] = sc.next();
		}*/
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("Size of given string is: " + str1.length());		//returns the length of the string
		//displaying string one character at a time
		for(int i = 0; i<str1.length(); i++){
			System.out.print(str1.charAt(i) + " ");
		}
		System.out.println(" ");
		System.out.println(str1.indexOf("is"));
		if(str2.equals(str1)){	//checking for string matching
			System.out.println("Strings do matches");
		} else{
			System.out.println("Strings do not match");
		}
		if(str3.equals(str1)){	//checking for string matching
					System.out.println("Strings do matches");
				} else{
					System.out.println("Strings do not match");
				}
	}
}
