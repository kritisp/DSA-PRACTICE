import java.util.Scanner;

public class helpfulMaths {

    public static void bubbleSort(char[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void easySum(String s) {
        int idx = 0;
        char[] ar = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                ar[idx++] = ch;
            }
        }

        bubbleSort(ar, idx);

        for (int i = 0; i < idx; i++) {
            System.out.print(ar[i]);
            if (i != idx - 1) {
                System.out.print("+");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sum string:");
        String s = sc.next();   // e.g. 3+2+1
        easySum(s);
        sc.close();
    }
}
