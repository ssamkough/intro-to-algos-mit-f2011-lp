package projects.project01;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

/* INCOMPLETE */
public class ExerciseC {
    public static List<List<Integer>> nSetCartesianProduct(List<List<Integer>> setList) {
        List<List<Integer>> cartesianProduct = new ArrayList<>();
        int amountOfPerms = 1;

        for (List<Integer> list : setList) {
            amountOfPerms *= list.size();
        }

        for (int i = 0; i < amountOfPerms; i++) {
            List<Integer> list = new ArrayList<>();
            cartesianProduct.add(list);
        }

        for (List<Integer> list : setList) {
            int listIndex = 0;
            int indexLongevity = amountOfPerms / list.size();
            int cart = 0;
            for (int i = 0; i < cartesianProduct.size(); i++) {
                if (listIndex == indexLongevity || indexLongevity == amountOfPerms) {
                    listIndex = 0;
                }
                cartesianProduct.get(cart).add(list.get(listIndex));
                cart++;
                listIndex++;
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

        List<Integer> C = new ArrayList<>();
        C.add(5);

        List<List<Integer>> setList = new ArrayList<>();
        setList.add(A);
        setList.add(B);
        setList.add(C);

        System.out.println(nSetCartesianProduct(setList));
    }
}