package com.archive.acm.archiveapp.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.archive.acm.archiveapp.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView ;
        TextView textView ;

        public ViewHolder(View v) {
            super(v);
            cardView = (CardView) v.findViewById(R.id.main_card_view) ;
            textView = (TextView) v.findViewById(R.id.main_card_text) ;
        }

    }


}
