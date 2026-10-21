interface Iconst{
    int MIN=0;
    int MAX=10;
    String ErrMsg="Boundary exceeds";
}

class ClassX implements Iconst {
    public static void main(String[] args) {
        int [] nums = new int[MAX];
        for(int i = MIN; i<MAX; i++){
            if(i>=MAX){
                System.out.println(ErrMsg);
            } else{
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
