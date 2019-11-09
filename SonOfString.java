public class SonOfString {
    public static void main(String[] args) {

        String s1 = "!SHINCHAN";
        String s2 = "?NOHARAAA";



        if (s1.length()-1>1 && s1.length()-1<5000 && s2.length()-1>1 && s2.length()-1<5000){
            char [] arr1 = s1.toCharArray();
            char [] arr2 = s2.toCharArray();
            int longi1 = arr1.length+1;


            int[][] arr = new int[arr1.length+1][arr1.length+1];

                for (int i = 1; i<arr1.length+1; i++) {
                    for (int j = 1; j < arr1.length + 1; j++) {
                        if (arr1[i - 1] == arr2[j - 1]) {
                            arr[i][j] = arr[i - 1][j - 1] + 1;
                        } else {
                            arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                        }
                    }

                }
            System.out.print(arr[longi1-1][longi1-1]);
            }else{
                System.out.println("error");
            }


        }
}
