package dammayxanh.com.intertedindex.example.bus;

import dammayxanh.com.intertedindex.example.list.EventHashMap;


import java.util.*;

public class CheckValue {
    private final static CheckValue checkValue = new CheckValue();

    private CheckValue() {
    }

    public static CheckValue GetInstance() {
        return checkValue;
    }

    // return index of element have max-count
    public Integer checkKey(EventHashMap eventHashMap, String question) {
        HashMap<Integer, Integer> listKey = new HashMap();
        Set result = new HashSet();
        String[] temp = question.split(" ");
        int indexOfKeyMaxCur = -1;

        for (String word : temp) {
            ArrayList<Integer> wordCountSet = eventHashMap.get(word.trim());
            try {
                for (Integer key : wordCountSet) {
                    // count word
                    try {
                        listKey.put(key, listKey.get(key) + 1);
                    } catch (Exception e) {
                        listKey.put(key, 1);
                    }

                    if (indexOfKeyMaxCur == -1) {
                        indexOfKeyMaxCur = key;
                        continue;
                    }
                    int keyMaxCur = listKey.get(indexOfKeyMaxCur);
                    int keyMax = listKey.get(key);
                    if (keyMax > keyMaxCur) indexOfKeyMaxCur = key;
                    //test
                    result.add(indexOfKeyMaxCur);
                }
            } catch (NullPointerException e) {

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return indexOfKeyMaxCur;
    }

}
