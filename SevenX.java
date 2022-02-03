package sevenX;

public class SevenX {
    public static void main(String[] args) {
        int[] arr ={5,7,2,9,8,3};
        int first=0,second=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>first) {
                second = first;
                first = arr[i];
            }else if(second<arr[i]){
                    second =arr[i];
                }
            }


        System.out.println(first +" " + second);
    }
}
