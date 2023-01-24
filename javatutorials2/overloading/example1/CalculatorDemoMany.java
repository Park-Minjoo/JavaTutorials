package overloading.example1;

/*
    The previous example is only an example for explaining overloading and overriding. (not realistic)
    What if to make an operation for more values?
    Let's change the code below.
 */
class CalculatorMany{
    int[] oprands;

    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }

    public void sum() {
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total);
    }

    public void avg(){
        int total = 0;
        for (int value : this.oprands){
            total += value;
        }
        System.out.println(total/this.oprands.length);
    }
}
public class CalculatorDemoMany {
    public static void main(String[] args){
        CalculatorMany c1 = new CalculatorMany();
        c1.setOprands(new int[]{10,20});
        c1.sum();
        c1.avg();
        c1.setOprands(new int[]{10,20,30,40,50,60,70,80,90,100});
        c1.sum();
        c1.avg();
    }
}
