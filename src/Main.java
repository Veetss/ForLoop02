public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        };

        for(int i = 0; i < num.length; i++){
            int numb = num[i];
            System.out.println("Fibonacci sequence: " + numb);
        }

        int a = 0;
        int b = 1;
        int c;

        for(int i = 1; i <= 10; i++){
            System.out.print(a + "  ");

            c = a + b;
            a = b;
            b = c;
        }
    }
}
