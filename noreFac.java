public class noreFac {

    public static int factorial(int num) {
        int fact = 1;
        if (num != 0) {
            for (int i = num; i > 0; i--) {
                fact *= i;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result); // Debería imprimir 120
    }
}