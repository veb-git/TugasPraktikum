package stack;

public class StackArray {
    // menentukan ukuran max 
//     static int[] arr = new int[5];
//     // menentukan index penunjuk paling atas/top
//     static int top = -1;

//     public static void push(int value){
//         if(top >= arr.length - 1){
//             System.out.println("stack penuh!!!");
//         }else{
//             arr[++top] = value;
//             System.out.println("nilai " + value + " ditambahkan");
//         }
//     }
//     public static void main(String[] args) {
//        push(10);
//        push(20);
//     }
    private int maxSize;    // Ukuran maksimal array
    private int[] stackArray; // Array untuk menyimpan data
    private int top;        // Penunjuk indeks paling atas

    // Constructor: Inisialisasi Stack
    public StackArray(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // -1 menandakan stack masih kosong
    }

    // Method PUSH: Menambahkan data
    public void push(int value) {
        // Cek apakah stack penuh (n = arr.length - 1 dalam logika Anda)
        if (top >= maxSize - 1) {
            System.out.println("Gagal: Stack Penuh! Tidak bisa menambahkan " + value);
        } else {
            // Increment top dulu, baru masukkan nilai
            stackArray[++top] = value; 
            System.out.println("Sukses: Nilai " + value + " ditambahkan.");
        }
    }

    // Method POP: Mengambil data paling atas (Opsional tapi penting untuk Stack)
    public int pop() {
        if (top == -1) {
            System.out.println("Gagal: Stack Kosong!");
            return -1; 
        } else {
            int oldTop = stackArray[top];
            top--; // Turunkan penunjuk top
            return oldTop;
        }
    }

    // Method PEEK: Mengintip data paling atas tanpa menghapusnya
    public int peek() {
        if (top == -1) {
            System.out.println("Stack Kosong");
            return -1;
        }
        return stackArray[top];
    }
    
    // Method untuk mengecek isi stack saat ini (Helper)
    public void printStack() {
        System.out.print("Isi Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    // Main Method untuk Testing
    public static void main(String[] args) {
        // Membuat stack dengan kapasitas 3 slot
        StackArray myStack = new StackArray(3);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        
        myStack.printStack();

        // Mencoba push saat penuh (Overflow test)
        myStack.push(40); 

        // Mengambil data (Pop)
        System.out.println("Pop nilai: " + myStack.pop());
        
        myStack.printStack();
    }
}

