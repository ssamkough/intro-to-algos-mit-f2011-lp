package projects.project01;

import java.util.Set;
import java.util.HashSet;

public class ExerciseC {
    public static Set<Set<Integer>> nSetCartesianProduct(int n) {
        Set<Set<Integer>> result = new HashSet<>();

        // create n sets
        for (int i = 0; i < n; i++) {
        }

        return result;
    }

    public static void main (String args[]) {
        int n = 3;
        System.out.println(nSetCartesianProduct(n));
    }
}