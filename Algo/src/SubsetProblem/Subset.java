package SubsetProblem;

import java.util.ArrayList;

public class Subset {

    public static void main(String[] args) {

        Subset subset = new Subset();

        ArrayList input = getInput();

        //System.out.println(input);
        input.sort(null);
        //System.out.println(input);

        /*for (int i = 0; i <input.size()-1 ; i++) {
            subset.printLexicalSubset(input,null,i,input.size()-1,i);
        }*/

        subset.printLexicalSubset(input,null,0,input.size()-1,0);
    }

    public static ArrayList getInput(){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(4);
        input.add(2);
        input.add(3);

        return input;
    }

    public void printLexicalSubset(ArrayList<Integer> input,ArrayList<Integer> generated, Integer begin, Integer end, Integer start){

        if (generated == null)
            generated = new ArrayList<Integer>();

        for (int i = begin; i <= end ; i++) {
            if (generated.size() == 0 ||
                    (!(generated.get(generated.size()-1).equals(input.get(i)) )
                            && generated.get(generated.size()-1)< input.get(i))){
                generated.add(input.get(i));
                System.out.println(""+generated);
                printLexicalSubset(input,generated,begin+1,end,start);
                generated.remove(generated.size()-1);
            }

            //System.out.println("number generated is "+generated);
        }

        System.out.println("========");
    }
}
