package com.osgroup.Util;

import com.osgroup.Model.CustomProcess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static com.osgroup.Application.maxSize;

public class Util {

    private Util(){

    }
    public static int maximumListSize(List<CustomProcess> customProcessList){
        List<Integer> allTimes = new ArrayList<Integer>();
        for (CustomProcess customProcess:customProcessList) {
            int total = customProcess.getArrivalTime()+customProcess.getBurstTime();
            allTimes.add(total);
        }
        return (Collections.max(allTimes)-1);
    }

    public static int maxPriority(List<CustomProcess> customProcessList){
        List<Integer> allTimes = new ArrayList<Integer>();
        for (CustomProcess customProcess:customProcessList) {
            int maxPriority = customProcess.getPriorityNumber();
            allTimes.add(maxPriority);
        }
        return (Collections.max(allTimes)-1);
    }

    public static void PriorityComparator(List<ArrayList<CustomProcess>> the_list){
        List<ArrayList<CustomProcess>> theArray = new ArrayList<ArrayList<CustomProcess>>();
        List<CustomProcess> tempList = new ArrayList<CustomProcess>();
        for (int a=0;a<the_list.size();a++) {
            System.out.println(the_list.get(a));
            for(int b=0;b<the_list.get(a).size();b++){

            }

            }

        System.out.println(tempList);
        }

    public static final <CustomProcess> void swap (List<CustomProcess> l, int i, int j) {
        Collections.<CustomProcess>swap(l, i, j);
    }

    }

