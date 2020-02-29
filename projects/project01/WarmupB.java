package projects.project01;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class WarmupB {
    public static Set<List<Integer>> twoSetCartesianProduct(List<Integer> A, List<Integer> B) {
        Set<List<Integer>> C = new HashSet<>();

        for (int i : A) {
            for (int j : B) {
                List<Integer> D = new ArrayList<>();
                D.add(i);
                D.add(j);
                C.add(D);
            }
        }

        return C;
    }

    public static void main (String args[]) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);

        List<Integer> B = new ArrayList<>();
        B.add(3);
        B.add(4);

        System.out.println(twoSetCartesianProduct(A, B));
    }
}