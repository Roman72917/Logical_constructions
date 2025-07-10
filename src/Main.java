import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_1 = sc.nextLine();
        String str_2 = sc.nextLine();
        int x = str_1.length();
        boolean c = str_1.contains(str_2);
        if (c || x > 20) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        sc.close();
    }
}