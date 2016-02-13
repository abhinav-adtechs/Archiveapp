package com.archive.acm.archiveapp.Activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.TextView;

import com.archive.acm.archiveapp.R;

public class CardViewMain extends AppCompatActivity {

    CardView cardView ;
    TextView mainText ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_card_cv);

        cardView = (CardView) findViewById(R.id.main_card_view) ;
        mainText = (TextView) findViewById(R.id.main_card_text) ;

        mainText.setText("TEST HEADING");

    }
}
