package com.osgroup;

import com.osgroup.Model.CustomProcess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.osgroup.Util.Util.swap;

public class Application {
    public static List<CustomProcess> individualProcesses;
    public static List<CustomProcess> getIndividualProcessesSorted;
    public static int maxSize = 0;
    static CustomProcess pIdle = new CustomProcess("PIDLE", 0, 0, 0);

    public static void main(String[] args) {
        List<CustomProcess> customProcesses = new ArrayList<CustomProcess>();
        individualProcesses = new ArrayList<CustomProcess>();
        CustomProcess customProcessOne = new CustomProcess("J1", 0, 5, 2);
        customProcesses.add(customProcessOne);
        CustomProcess customProcessTwo = new CustomProcess("J2", 3, 6, 4);
        customProcesses.add(customProcessTwo);
        CustomProcess customProcessThree = new CustomProcess("J3", 4, 5, 4);
        customProcesses.add(customProcessThree);
        CustomProcess customProcessFour = new CustomProcess("J4", 7, 3, 6);
        customProcesses.add(customProcessFour);

        for (int x = 0; x < customProcesses.size(); x++) {

            for (int i = 0; i < customProcesses.get(x).getBurstTime(); i++) {
                int newArrivalTime = customProcesses.get(x).getArrivalTime() + i;
                int newBurstTime  = customProcesses.get(x).getBurstTime()-i;
                individualProcesses.add(new CustomProcess(customProcesses.get(x).getJobName(), newArrivalTime, newBurstTime, customProcesses.get(x).getPriorityNumber()));

            }
        }
        for (CustomProcess item :
                individualProcesses) {
            System.out.println(item);
        }
        System.out.println();
        for (CustomProcess item:
                individualProcesses) {
            System.out.print(item.getJobName()+",");
        }
        System.out.println();

        for (int y = 0; y < individualProcesses.size(); y++) {
            for (int t = y + 1; t < individualProcesses.size(); t++) {
                if(!individualProcesses.get(y).getJobName().equals(individualProcesses.get(t).getJobName())){
                    if((individualProcesses.get(t).getArrivalTime()<=individualProcesses.get(y).getArrivalTime())&&(individualProcesses.get(t).getPriorityNumber()>individualProcesses.get(y).getPriorityNumber())){
                        System.out.println("I:"+individualProcesses.get(y));
                        System.out.println("J:"+individualProcesses.get(t));
                        swap(individualProcesses,t,y);
                        individualProcesses.get(t).setArrivalTime(t);
                        for (CustomProcess item:
                                individualProcesses) {
                            System.out.print(item.getJobName()+",");
                        }
                        System.out.println();
                    }
                    else if((individualProcesses.get(t).getArrivalTime()<= individualProcesses.get(y).getArrivalTime()) && (individualProcesses.get(t).getPriorityNumber() == individualProcesses.get(y).getPriorityNumber())){
                        if(individualProcesses.get(t).getBurstTime()<individualProcesses.get(y).getBurstTime()){
                            System.out.println("I:"+individualProcesses.get(y));
                            System.out.println("J:"+individualProcesses.get(t));
                            swap(individualProcesses,t,y);
                            individualProcesses.get(t).setArrivalTime(t);
                            individualProcesses.get(y).setArrivalTime(y);
                            for (CustomProcess item:
                                    individualProcesses) {
                                System.out.print(item.getJobName()+",");
                            }
                            System.out.println();
                        }

                    }
                }
            }
        }


        for (CustomProcess item:
                individualProcesses) {
            System.out.print(item.getJobName()+",");
        }
        System.out.println();
    }
}
