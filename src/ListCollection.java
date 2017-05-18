import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by asus on 15.05.17.
 */
public class ListCollection {

    public static void main(String[] args) {

        System.out.print("Enter size collection: ");
        Scanner key = new Scanner(System.in);
        int sizeCollection = correctEnterToIntScanner(key);


            //Create colection
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < sizeCollection-1; i++) {
            int randomValue = 0+(int)(Math.random()*50);
            list.add(i,randomValue);
        }
        System.out.println("Your collection: " + list);

        System.out.println();

        //add value in collection
        System.out.println("1. Add to collection.");
        System.out.print("Enter index in collection: ");
        Scanner index = new Scanner(System.in);
        int Index = correctEnterToIntScanner(index);

        System.out.print("Enter value: ");
        Scanner valueToInCollection = new Scanner(System.in);
        int ValueToInCollection = correctEnterToIntScanner(valueToInCollection);

        if ((Index-1)<=list.size()) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)+ValueToInCollection);
        }


            list.add(Index - 1, ValueToInCollection);
            System.out.println("1: " + list);
        } else System.out.println("Out of zone collection!");
        System.out.println();
        //remove from collection

        System.out.println("2. Remove from collection");
        System.out.print("Enter index to remove: ");
        Scanner remove = new Scanner(System.in);

        int Remove = correctEnterToIntScanner(remove);
        int k = list.get(Remove-1);
        if ((Remove-1)<=list.size()) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)-k);
        }


            list.remove(Remove - 1);
            System.out.println("2: "+list);
        } else System.out.println("Out of zone collection!");
        System.out.println();


        //found elements

        System.out.println("3. Found into collection for value");
        System.out.print("Enter value: ");
        Scanner value = new Scanner(System.in);
        int Value = correctEnterToIntScanner(value);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == Value) {
                int j=1;
                System.out.println(j+". Index your value: " + (i));
                j++;
            }
        }
        System.out.println();

        System.out.println("3. Found into collection for index");
        System.out.print("Enter index: ");
        Scanner indexE = new Scanner(System.in);
        int IndexE = correctEnterToIntScanner(indexE);

            if (IndexE<list.size()+1){
            System.out.println("Faund value for index :" + list.get(IndexE-1));
        } else System.out.println("Out of zone collection!");
        System.out.println();

           //Found max

        System.out.println("3. Found MAX elements.");
            int max = 0;
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)>max){
                    max = list.get(i);
                }
            }
            System.out.println("Max elements:" + max);
        System.out.println();
        //Found min

        System.out.println("3. Found MIN elements.");
        int min = 0;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<min){
                min = list.get(i);
            }
        }
        System.out.println("Min elements:" + min);

        System.out.println();
        System.out.println("3. Calculate all Elements.");
        int resultOfCalculate = 0;
        for (int i = 0; i <list.size() ; i++) {
            resultOfCalculate = resultOfCalculate + list.get(i);
        }
        System.out.println("Resalt calculate :" + resultOfCalculate);


    }



    static int correctEnterToIntScanner(Scanner keyboard)
    {
        while (!keyboard.hasNextInt())
        {
            System.err.println("You mast enter only integer value!!!");
            keyboard.next();
        }
        return keyboard.nextInt();
    }
}
