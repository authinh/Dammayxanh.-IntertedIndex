package dammayxanh.com.intertedindex.example;

import dammayxanh.com.intertedindex.example.bean.EventTime;
import dammayxanh.com.intertedindex.example.bus.CheckValue;
import dammayxanh.com.intertedindex.example.dao.DataContext;
import dammayxanh.com.intertedindex.example.list.EventHashMap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        EventHashMap eventList = null;
        ArrayList<EventTime> evenTimeList = null;
        Scanner scanner = new Scanner(System.in);
        String ques;
        CheckValue checkValue = CheckValue.GetInstance();
        try {
            DataContext dataContext = DataContext.getInstance();
            ArrayList dataList = dataContext.readFileKey("tailieucuateo.txt");
            eventList = (EventHashMap) dataList.get(0);
            evenTimeList = (ArrayList) dataList.get(1);

            System.out.println("enter your event name:");
            ques = scanner.nextLine();
            Integer index = checkValue.checkKey(eventList,ques);

            EventTime eventTime = evenTimeList.get(index);
            System.out.println(eventTime.toString());
        }catch (NullPointerException e){

        } catch (IOException e) {

        } catch (Exception e) {

        }

    }
}
