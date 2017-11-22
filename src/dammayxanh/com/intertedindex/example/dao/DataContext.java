package dammayxanh.com.intertedindex.example.dao;

import dammayxanh.com.intertedindex.example.bean.EventTime;
import dammayxanh.com.intertedindex.example.list.EventHashMap;


import java.io.*;
import java.util.ArrayList;

public class DataContext {
    private static DataContext instance = new DataContext();

    private DataContext(){}

    public static DataContext getInstance(){
        return instance;
    }

    /*input: file path
        return 2 value: List Event, List Time
     *  */
    public ArrayList readFileKey(String filePath) throws IOException {// make write file
        InputStream in = new FileInputStream(filePath);
        Reader reader = new InputStreamReader(in, "UTF-8");
        BufferedReader br = new BufferedReader(reader);
        ArrayList list =new ArrayList();
        ArrayList<EventTime> evenTimetList =new ArrayList();
        EventHashMap listKeyTraining=new EventHashMap();

        ArrayList result = new ArrayList();
        result.add(listKeyTraining);
        result.add(evenTimetList);


        String s = null;
        int index = 0;

        while ((s = br.readLine()) != null) {

            String[] strArr = s.split("\t");
            String[] strKey = strArr[0].split(" ");
            String strTime;
            String strEvent;
            try {
                strTime = strArr[1];
                strEvent = strArr[0];
            } catch (Exception e){
                strTime = "no time";
                strEvent = "no event";
            }

            evenTimetList.add(new EventTime(strEvent,strTime));

            for(String temp : strKey){
                listKeyTraining.put(temp,index);
            }
            index++;
        }
        br.close();

        return result;
    }



}
