package stack;

import java.util.Stack;

public class StackCheck {

    // Fungsi untuk mengecek apakah string valid
    public static boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();

        // Loop setiap karakter dalam string
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // 1. Jika kurung BUKA, masukkan ke Stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // 2. Jika kurung TUTUP, kita perlu mengecek
            else if (c == ')' || c == '}' || c == ']') {
                
                // Jika stack kosong tapi ada kurung tutup, pasti SALAH
                // Contoh: "())" -> error saat ketemu ')' terakhir
                if (stack.isEmpty()) {
                    return false;
                }

                // Ambil kurung pembuka paling atas di stack
                char top = stack.pop();

                // Cek apakah pasangan cocok?
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false; // Pasangan tidak cocok
                }
            }
        }

        // 3. Setelah selesai loop, Stack harus kosong.
        // Jika masih ada isi, berarti ada kurung buka yang tidak ditutup.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String code1 = "{[()]}";      // Valid
        String code2 = "{[(])}";      // Invalid (Urutan salah)
        String code3 = "(((";         // Invalid (Kurang tutup)
        
        System.out.println("Code 1: " + code1 + " -> " + isValid(code1));
        System.out.println("Code 2: " + code2 + " -> " + isValid(code2));
        System.out.println("Code 3: " + code3 + " -> " + isValid(code3));
    }
}