import java.util.Scanner;
class Bubble{
	int size, t;
	int [] nums;
	void getdata(){		//taking input with this method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array: ");
		size = sc.nextInt();
		nums = new int[size];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++){
			nums[i] = sc.nextInt();
		}
	}
	void show(){
		for(int el : nums){		//using for each loop
			System.out.print(el + " ");
		}
		System.out.println(" ");
	}
	void BubbleSort(){		//mechanics of bubble sort
		for(int a = 1; a<size; a++){
			for(int b=size-1; b>=a; b--){
				if(nums[b-1]>nums[b]){
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;
				}
			}
		}
	}
}

class Sort{
	public static void main(String[] args){
		Bubble b = new Bubble();		//creating object of our Bubble class
		b.getdata();
		System.out.println("Before sorting: ");
		b.show();
		b.BubbleSort();
		System.out.println("After sorting: ");
		b.show();
	}
}
