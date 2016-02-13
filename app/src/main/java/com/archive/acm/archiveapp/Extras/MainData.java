package com.archive.acm.archiveapp.Extras;


import java.util.ArrayList;
import java.util.List;

public class MainData {
    String heading;
    MainData(String heading){
        this.heading = heading ;
    }

    private List<MainData> headings ;

    private void initializeData(){
        headings = new ArrayList<>();
        headings.add(new MainData("Discussion Room"));
        headings.add(new MainData("Calendar"));
        headings.add(new MainData("Archives"));
    }

}
