public class countsort {
    public static void sort(int[] arr){
        int n = arr.length;
        if ( n == 0) return;

        int max = arr[0];
        int min = arr[0];
        for(int x : arr){
            if (x > max) max = x;
            if (x < min) min = x;
        }
        int range = max - min + 1;
        int[] count = new int[range];

        for( int x : arr){
            count[x - min]++;
        }

        int arrIndex = 0;

        for(int i = range - 1; i >= 0; i--){
            int nilaiElement = i + min;
    
        while(count[i] > 0){
            arr[arrIndex++] = nilaiElement;
            count[i]--;
        }
    }
    }
    public static void main(String[] args) {
        int[] dataAwal = {5, 2, 9, 5, 2, 3, 5, 1};
        System.out.println("dataAwal : ");
        printArray(dataAwal);
        sort(dataAwal);
        System.out.println("\ndata tersusun secara descending : ");
        printArray(dataAwal);
    }
    
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + (i < arr.length ? "," : ""));
        }  
    }
}