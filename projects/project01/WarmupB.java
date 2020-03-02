package projects.project01;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class WarmupB {
    public static Set<List<Integer>> twoSetCartesianProduct(List<Integer> setA, List<Integer> setB) {
        Set<List<Integer>> cartesianProduct = new HashSet<>();

        for (int i : setA) {
            for (int j : setB) {
                System.out.println("A: " + i + ", B: " + j);
                List<Integer> setD = new ArrayList<>();
                setD.add(i);
                setD.add(j);
                cartesianProduct.add(setD);
            }
        }

        return cartesianProduct;
    }

    public static void main(String args[]) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);

        List<Integer> B = new ArrayList<>();
        B.add(3);
        B.add(4);

        System.out.println(twoSetCartesianProduct(A, B));

        B.add(5);

        System.out.println(twoSetCartesianProduct(A, B));
    }
}