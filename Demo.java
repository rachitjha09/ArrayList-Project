import java.util.ArrayList;
import java.util.Arrays;
/**
 * Demo ArrayList
 * @author (Rachit Jha)
 * @version (1/30/24)
 */
public class Demo
{
    /*
    public static void printList(ArrayList<Double> data){
        for(Double i : data){
            System.out.println(i);
        }
    }
    public static void printMinAndMax(ArrayList<Double> d){
        double min=d.get(0);
        double max=d.get(0);
        for(Double i: d){
            if(i<min){
                min=i;
            } 
            if(i>max){
                max=i;
            }
        }
        System.out.println("Min is: " + min + " And max is: " + max); 
    }
    */
    public static void main(String[]args){
        /*
        ArrayList<Double> a=new ArrayList<Double>();
        System.out.println(a.size());
        a.add(3.4);
        a.add(0.9);
        a.add(5.2);
        a.add(-2.7);
        printList(a);
        printMinAndMax(a);
        ArrayList<Boolean> b=new ArrayList<Boolean>();
        b.add(true);
        b.add(false);
        b.add(false); 
        
        ArrayList<Double> a=new ArrayList<Double>(Arrays.asList(4.5, 7.8, 0.3, -9.0));
        System.out.println(a);
        a.remove(0.3);
        System.out.println(a);
        ArrayList<Double> d=new ArrayList<Double>(Arrays.asList(4.5, 7.8, 0.3, -9.0));
        System.out.println(d);
        d.remove(2);
        System.out.println(d);
        
        
        ArrayList<Double>b=new ArrayList<Double>(Arrays.asList(7.0, -2.4, 7.0, 0.0, 0.0, 7.0, 4.5));
        System.out.println(b);
        b.remove(7.0);
        for(int i=0; i<b.size(); i++){
            if(a.get(i).equals(7.0)){
                b.remove(i);
            }
        }
        System.out.println(b);
        */
       
        ArrayList<Double>a=new ArrayList<Double>(Arrays.asList(7.0, -2.4, 7.0, 5.0, 0.0, 7.0, 4.5));
        System.out.println(a);
        double x=a.remove(1);
        boolean b=a.remove(-2.4);
        double d=a.set(0, 5.6);
        System.out.println(a);
        System.out.println(x);
        System.out.println(b);
        System.out.println(d);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        for(int i=a.size()-1; i>=0; i--){
            if(a.get(i).equals(7.0)){
                a.remove(i);
            }
        }
        System.out.println(a);
    }
}