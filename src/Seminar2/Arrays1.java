package Seminar2;

import java.util.ArrayList;

public class Arrays1 {
    private int[] values;
    private int[] weight;
    public Arrays1(int[] values, int[] weight){
        this.values = values;
        this.weight = weight;
    }

    public int[] getValues() {
        return values;
    }

    public int[] getWeight() {
        return weight;
    }
    public Integer randomValue() {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i=0; i<this.values.length; i++){
            for (int k=0; k<=this.weight[i]; k++) {
                x.add(values[i]);

            }
        }

        return x.get((int) (Math.random()*x.size()));
    }
    public static void main(String[] args) {
        Arrays1 obj = new Arrays1(new int[] {1,2,3}, new int[] {10,2,1});
        for (int i=0; i < 13; i++) {
            System.out.println(obj.randomValue());

        }
    }
}
