package com.archive.acm.archiveapp.Activity;

import android.content.Intent;
import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.archive.acm.archiveapp.Adapters.MainAdapter;
import com.archive.acm.archiveapp.R;
import com.archive.acm.archiveapp.Utils.Constants;
import com.archive.acm.archiveapp.Utils.MainData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    public List<MainData> headingsList;
    private RecyclerView mainRecyclerView ;
    private MainAdapter mainRecyclerAdapter ;
    private RecyclerView.LayoutManager mainLayoutManger ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Code to get Device height and width, to properly set the UI on the screen.
         */
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        Constants.DEVICE_WIDTH = size.x;
        Constants.DEVICE_HEIGHT = size.y;


        /**
         * Setting Flags to make Activity go fullscreen.
         */
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        initialize();
        initializeData();
        initializeAdapter();
    }

    /**
     * All Initializations - RecyclerView, LayoutManager, Individual Data and RecyclerView adapter
     */
    private void initialize(){

        mainRecyclerView = (RecyclerView) findViewById(R.id.main_recycler_view) ;
        mainLayoutManger = new LinearLayoutManager(this) ;
        mainRecyclerView.setLayoutManager(mainLayoutManger);
        mainRecyclerView.setHasFixedSize(true);
    }

    public void initializeData() {
        headingsList = new ArrayList<>();
        headingsList.add(new MainData("Discussion Room"));
        headingsList.add(new MainData("Calendar"));
        headingsList.add(new MainData("Archives"));
    }

    public void initializeAdapter(){
        mainRecyclerAdapter = new MainAdapter(headingsList) ;
        mainRecyclerView.setAdapter(mainRecyclerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings)
            startActivity(new Intent(this, SettingsActivity.class));
        return super.onOptionsItemSelected(item);
    }
}
