import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by asus on 23.05.17.
 */
public class bodyProgramm {

    public void Start (){

        operationToCollection workToCollection = new operationToCollection();

        int sizeCollection = correctEnterToIntScanner(new Scanner(System.in),"Enter size collection");

        //Create colection
        ArrayList<Integer> list = new ArrayList<Integer>();

        list = workToCollection.createCollection(sizeCollection);

        System.out.println("Your collection: " + list);
        System.out.println();

        //add value in collection
        System.out.println("1. Add to collection.");
        int index = correctEnterToIntScanner(new Scanner(System.in),"Enter index in collection");
        int valueToInCollection = correctEnterToIntScanner(new Scanner(System.in),"Enter value");
        list = workToCollection.addWithIncriment(list, index,valueToInCollection);

        System.out.println("1: " + list);
        System.out.println();

        //remove from collection
        System.out.println("2. Remove from collection");
        int removeIndex = correctEnterToIntScanner(new Scanner(System.in),"Enter index to remove");
        list = workToCollection.removeFromList(list,removeIndex);
        System.out.println("2: "+ list);

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



    static int correctEnterToIntScanner(Scanner keyboard, String messageInput)
    {
        System.out.print(messageInput + " : ");
        while (!keyboard.hasNextInt())
        {
            System.err.println("You mast enter only integer value!!!");
            keyboard.next();
        }
        return keyboard.nextInt();
    }

}
