import java.util.ArrayList;
import java.util.Arrays;

public class Exercicios {

    public int exercicio1(int n) {
        if (n < 0) throw new IllegalArgumentException("Número deve ser não-negativo");
        if (n == 0) return 1;
        return n * exercicio1(n - 1);
    }

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
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return exercicio5(s.substring(1, s.length() - 1));
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

    public int exercicio8(ArrayList<Integer> ar) {
        if (ar.size() == 1) return ar.get(0);
        int last = ar.remove(ar.size() - 1);
        return Math.max(last, exercicio8(ar));
    }

    public boolean exercicio9(String str, String match) {
        if (str.length() < match.length()) return false;
        if (str.startsWith(match)) return true;
        return exercicio9(str.substring(1), match);
    }

    public int exercicio10(int n) {
        if (n < 10) return 1;
        return 1 + exercicio10(n / 10);
    }

    public ArrayList<String> exercicio11(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s.length() == 0) {
            result.add("");
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String rem = s.substring(0, i) + s.substring(i + 1);
            for (String subPerm : exercicio11(rem)) {
                result.add(c + subPerm);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Exercicios ex = new Exercicios();
        System.out.println(ex.exercicio1(5));
        System.out.println(ex.exercicio2(6));
        System.out.println(ex.exercicio3(8));
        System.out.println(ex.exercicio4(6, 8));
        System.out.println(ex.exercicio5("arara"));
        System.out.println(ex.exercicio5("cuscuz"));
        System.out.println(ex.exercicio6(24));
        System.out.println(ex.exercicio7(new int[]{1,2,3,4,9,78,4}));
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 9, 3, 7, 4));
        System.out.println("Maior elemento: " + ex.exercicio8(lista));
        System.out.println("Substring: " + ex.exercicio9("hello world", "world"));
        System.out.println("Número de dígitos: " + ex.exercicio10(12345));
        System.out.println("Permutações: " + ex.exercicio11("abc"));
    }
}
