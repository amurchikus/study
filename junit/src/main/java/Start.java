/**
 * Created by Eugen on 9/18/2016.
 */
public class Start {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 40,6};
        int c;

        c = 0;
        for (int i = 0; i < arr.length; i++) {

            if (c < arr.length){
                if (c < arr[i + 1]) {
                    c = arr[i + 1];

                }
            }


        }
        System.out.println(c);
    }
}