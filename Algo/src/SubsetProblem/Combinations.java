package SubsetProblem;

import java.util.ArrayList;

public class Combinations {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        Integer n,k;
        n = 10;
        k=1;
        Combinations subset = new Combinations();
        ArrayList input = getInput(n);
        subset.printLexicalSubset(input,null,0,input.size()-1,0,k);
    }

    public static ArrayList getInput(Integer n){

        ArrayList<Integer> input = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            input.add(i);
        }
        return input;
    }

    public ArrayList<ArrayList<Integer>> printLexicalSubset(ArrayList<Integer> input,ArrayList<Integer> generated, Integer begin, Integer end, Integer start, Integer limit){

        if (generated == null)
            generated = new ArrayList<Integer>();

        for (int i = begin; i <= end ; i++) {
            if (generated.size() == 0 ||
                    (!(generated.get(generated.size()-1).equals(input.get(i)) )
                            && generated.get(generated.size()-1)< input.get(i))){
                generated.add(input.get(i));
                addtoResult(generated,limit);
                printLexicalSubset(input,generated,begin+1,end,start,limit);
                generated.remove(generated.size()-1);
            }
        }
        return result;
    }

    public void addtoResult(ArrayList<Integer> generated,Integer limit){
        if(generated.size()==limit){
            System.out.println(""+generated);
            ArrayList<Integer> integers = new ArrayList<>();
            for (Integer k :generated) {
                integers.add(k);
            }
            result.add(integers);
        }
    }

    public Integer getGeneratedSum(ArrayList<Integer> integers){
        Integer sum =0;
        for (Integer i:integers) {
            sum = sum+i;
        }

        return sum;
    }
}
