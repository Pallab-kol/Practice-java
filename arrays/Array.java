import java.util.Scanner;
class ArrMinMax{
	int size;
	int min, max;
	int [] nums;
	void getdata(){
		System.out.println("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		nums = new int[size];
		for(int i = 0; i < size; i++){
			nums[i] = sc.nextInt();
		}
	}
	void MinMax(){
		min = max = nums[0];
		for(int k= 1; k<size; k++){
			if(nums[k] < min){
				min=nums[k];
			}
			if(nums[k] > max){
				max=nums[k];
			}
		}
	}
	void show(){
		System.out.println("Your array is: ");
		for(int j = 0; j < size; j++){
			System.out.print(nums[j] + " ");
		}
		System.out.println(" ");
		System.out.println("Min value is: "+min+ " and max value is: "+ max);
	}
}

class Array{
	public static void main(String[] args){
		ArrMinMax arr = new ArrMinMax();
		arr.getdata();
		arr.MinMax();
		arr.show();
	}
}
