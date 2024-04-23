package looping;

public class array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};

        for (int count = 0; count < a.length; count++){
            int index = count + 1 + count;
            if (index < a.length){
                System.out.println("index a[" + index + "], nilai a = " + a[index]);
            }
        }
        
        System.out.println("-------------------------------------------------");

        for (int index = 0; index < a.length; index++){
            int oddIndex = index %2;
            if (oddIndex != 0){
                System.out.println("index a[" + index + "], nilai a = " + a[index]);
            }
        }
    }
}
