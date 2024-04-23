package looping;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args){
        int[] bilangan = {34, 84, 15};
        
        System.out.println("Bilangan sebelum diurutkan: ");
        for (int num : bilangan){
            System.out.println(num + " ");
        }

        bubbleSort(bilangan);

        System.out.println("\nBilangan setelah diurutkan: ");
        for (int num : bilangan){
            System.out.println(num + " ");
        }
    }
}