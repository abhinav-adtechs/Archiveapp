package com.archive.acm.archiveapp.Activity;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import com.archive.acm.archiveapp.Adapters.MainAdapter;
import com.archive.acm.archiveapp.R;

public class MainActivity extends Activity {

    private RecyclerView mainRecyclerView ;
    private RecyclerView.Adapter mainRecyclerAdapter ;
    private RecyclerView.LayoutManager mainLayoutManger ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        mainRecyclerView = (RecyclerView) findViewById(R.id.main_recycler_view) ;
        mainRecyclerView.setHasFixedSize(true);

        mainLayoutManger = new LinearLayoutManager(this) ;
        mainRecyclerView.setLayoutManager(mainLayoutManger);

        mainRecyclerAdapter = new MainAdapter(new String[]{
                "DISCUSSION", "CALENDAR", "ARCHIVE"
        }) ;
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
