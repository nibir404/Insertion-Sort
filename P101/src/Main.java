public class Main {
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;i++)
            System.out.println(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={22,56,7,85,32,4};
        Sort sort = new Sort();
        System.out.println("before insertion sort :");
        printArray(arr);
        System.out.println("\n");
        sort.InsertionSort(arr);
        System.out.println("After insertion sort : ");
        printArray(arr);
    }
}
