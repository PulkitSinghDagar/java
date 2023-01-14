public class wavefromarryas {
    public static void main(String[] args) {

        int[] arr={1,22,33,3,44,4,55,5,66,6,778,99};
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }

            System.out.println(arr[i]);
//            for (i=0;i<arr.length;i++){
//                System.out.println(arr[i]);
//                for ( int j=arr.length-1;j<0;j++){
//                    System.out.println(arr[j]);
//                }
//            }
        }
    }
}
