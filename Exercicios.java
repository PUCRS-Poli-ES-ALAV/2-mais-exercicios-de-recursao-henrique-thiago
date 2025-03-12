import java.util.Arrays;

public class Exercicios {

    public int exercicio2(int n) {
        if (n < 0) return n + exercicio2(n+1);
        if (n == 0) return 0;
        if (n == 1) return 1;

        return n + exercicio2(n-1);
    }

    public int exercicio3(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 0) return 0;
        if (n == 1) return 1;
        return exercicio3(n-1) + exercicio3(n-2);
    }

    public int exercicio4(int j, int k) {
        if (j < 0) throw new IllegalArgumentException();
        if (k < 0) throw new IllegalArgumentException();
        if (j == k) return 0;
        if (j > k) return j + exercicio4(j-1, k);
        else return k + exercicio4(j, k-1);
    }

    boolean exercicio5(String s) {
        // ???
        return true;
    }

    public String exercicio6(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 0) return "0";
        if (n == 1) return "1";
        String base = (n % 2 == 0) ? "0" : "1";
        return exercicio6((n/2)) + base;
    }

    public int exercicio7(int[] n) {
        if (n.length == 0) return 0;
        if (n.length == 1) return n[0];
        return n[n.length-1] + exercicio7(Arrays.copyOf(n, n.length-1));
    }


    public static void main(String[] args) {
        Exercicios ex = new Exercicios();
        System.out.println(ex.exercicio2(6));
        System.out.println(ex.exercicio3(8));
        System.out.println(ex.exercicio4(6, 8));
        System.out.println(ex.exercicio5("arara"));
        System.out.println(ex.exercicio5("cuscuz"));
        System.out.println(ex.exercicio6(24));
        System.out.println(ex.exercicio7(new int[]{1,2,3,4,9,78,4}));

    }
}
