package com.example.example;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myapplication extends Application {

    private static List<president> presidentList=new ArrayList<president>();
    private static int nextid=4;

    public myapplication() {

        fillpresidentlist();
    }

    private void fillpresidentlist() {
        president p0=new president(0,"agd",200);
        president p1=new president(1,"sftyry",234);
        president p2=new president(2,"dvvxr",32);
        president p3=new president(3,"ffdt",34);
        presidentList.addAll(Arrays.asList(new president[]{p0,p1,p2,p3}));
    }

    public static List<president> getPresidentList() {

        return presidentList;
    }

    public static void setPresidentList(List<president> presidentList) {
        myapplication.presidentList = presidentList;
    }

    public static int getNextid() {
        return nextid;
    }

    public static void setNextid(int nextid) {

        myapplication.nextid = nextid;
    }
}
