package SubsetProblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CombinationSum {
    LinkedHashSet <ArrayList<Integer>> resultSet = new LinkedHashSet<>();
    ArrayList<ArrayList<Integer>> result;

    public ArrayList getInput(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(8);
        input.add(10);
        input.add(6);
        input.add(11);
        input.add(1);
        input.add(16);
        input.add(8);

        return input;
    }

    public Integer getGeneratedSum(ArrayList<Integer> integers){
        if (integers==null){
            integers = new ArrayList<Integer>();
        }
        Integer sum =0;
        for (Integer i:integers) {
            sum = sum+i;
        }

        return sum;
    }

    public void addtoResult(ArrayList<Integer> generated){
        System.out.println(generated);
            ArrayList<Integer> integers = new ArrayList<>();
            for (Integer k :generated) {
                integers.add(k);
            }

            integers.sort(null);

            resultSet.add(integers);
    }

    public static void main(String[] args) {

        CombinationSum cs = new CombinationSum();

        ArrayList input = cs.getInput();

        input.sort(null);
        Integer sum = 28;
        //System.out.println("\n\n\n");
        cs.getCombinationForSum(input,new ArrayList<>(),sum);

    }

    public Set<ArrayList<Integer>> getCombinationForSum(ArrayList<Integer> input,ArrayList<Integer> generated, Integer sum){

        //System.out.println(getGeneratedSum(generated) +"===--==="+ sum+"   "+generated);
        if (getGeneratedSum(generated) < sum){
            for (int i = 0; i < input.size() ; i++) {
                if (sum - getGeneratedSum(generated) > input.get(i) ){
                    generated.add(input.get(i));
                    getCombinationForSum(input,generated,sum);
                    generated.remove(generated.size()-1);
                }else if((sum - getGeneratedSum(generated))== input.get(i)){

                    generated.add(input.get(i));
                    getCombinationForSum(input,generated,sum);
                    addtoResult(generated);
                    generated.remove(generated.size()-1);
                }
            }
        }

        return resultSet;
    }
}
