package com.archive.acm.archiveapp.Activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.archive.acm.archiveapp.Adapters.MainAdapter;
import com.archive.acm.archiveapp.R;
import com.archive.acm.archiveapp.Utils.Constants;

public class CardViewMain extends AppCompatActivity {

    CardView cardView ;
    TextView mainText ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_card_cv);

        cardView = (CardView) findViewById(R.id.main_card_view) ;
        mainText = (TextView) findViewById(R.id.main_card_text) ;

        ViewGroup.LayoutParams params = cardView.getLayoutParams();
        params.height = Constants.DEVICE_HEIGHT/3;
        cardView.setLayoutParams(params);

        cardView.setClickable(true);

        mainText.setText("TEST HEADING");

    }

    public void personalizeCard(){
        switch (MainAdapter.POSITION){
            case 0: return;
        }
    }

}
