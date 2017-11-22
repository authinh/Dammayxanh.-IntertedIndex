package dammayxanh.com.intertedindex.example.list;

import java.util.ArrayList;
import java.util.HashMap;

public class EventHashMap extends HashMap<String,ArrayList<Integer>> {


    public  ArrayList<Integer> put(String key,int value){

        try {
            ArrayList<Integer> listValue = get(key);
            //if haven't value in listValue then add value in to list
            if(!listValue.contains(value)) {
            listValue.add(value);}
            return super.put(key,listValue);

        }catch (NullPointerException e){
            //if listValue wasn't declared then declared
            ArrayList<Integer> listValue = new ArrayList<Integer>();
            listValue.add(value);
            return super.put(key,listValue);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
