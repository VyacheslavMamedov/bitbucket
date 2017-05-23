import sun.java2d.pipe.AAShapePipe;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by asus on 21.05.17.
 */
public class operationToCollection {


    public ArrayList createCollection (Integer size) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            int randomValue = 0+(int)(Math.random()*50);
            list.add(i,randomValue);
        }
        return list;
    }

public ArrayList addWithIncriment (ArrayList mainList, Integer position,Integer value ){

        ArrayList<Integer> list = new ArrayList<Integer>(){
            @Override
            public void add(int index, Integer element) {
                super.add(index, element+value);
            }
        };

    for (int i = 0; i < mainList.size(); i++) {
        list.add(i,(Integer)mainList.get(i));
    }
        list.add(position-1,value-value);
        return list;
    }

  protected ArrayList  removeFromList(ArrayList mainList, Integer position) {
    ArrayList<Integer> list = new ArrayList<Integer>(){
        @Override
        public void add(int index, Integer element) {
            super.add(index, element -(Integer) mainList.get(position-1));
        }
    };

      for (int i = 0; i < mainList.size(); i++) {
          list.add(i,(Integer)mainList.get(i));
      }
      list.remove(position-1);
      return list;
}

}
