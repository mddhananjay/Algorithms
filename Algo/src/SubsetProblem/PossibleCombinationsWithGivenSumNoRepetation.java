package SubsetProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by himanshu on 9/7/17.
 */
public class PossibleCombinationsWithGivenSumNoRepetation {
    public static void main(String [] args){
        int k = 32;
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(8);
        a.add(10);
        a.add(6);
        a.add(11);
        a.add(1);
        a.add(1);
        a.add(16);
        a.add(8);
        System.out.println(combinationSum(a,k));
    }

    private static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        ArrayList<Integer> tempUsed = new ArrayList<Integer>();
        Collections.sort(a);
        printPossibleCombinations(a, b, tempUsed, 0);
        return result;
    }

    private static void printPossibleCombinations(ArrayList<Integer> a, int k, ArrayList<Integer> tempUsed, int start){
        if(k < 0){
            return;
        }

        if(k == 0){
            result.add(new ArrayList<Integer>(tempUsed));
        }

        for(int i = start; i < a.size(); i++){
            tempUsed.add(a.get(i));
            printPossibleCombinations(a, (k-a.get(i)), tempUsed, i+1);
            tempUsed.remove(a.get(i));
        }
    }
}