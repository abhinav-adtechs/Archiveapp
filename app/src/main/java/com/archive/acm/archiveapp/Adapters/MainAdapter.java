package com.archive.acm.archiveapp.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.archive.acm.archiveapp.Utils.MainData;
import com.archive.acm.archiveapp.R;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewHolder>{

    List<MainData> headings ;
    public MainAdapter(List<MainData> headings) {
        this.headings = headings;
    }

    /**
     * Initializing the default view setup for the recyclerview elements
     */
    public static class viewHolder extends RecyclerView.ViewHolder{

        CardView cardView ;
        TextView textView ;

        /**
         *
         * @param v passing param to reduce the access time.
         */
        public viewHolder(View v) {
            super(v);
            cardView = (CardView) v.findViewById(R.id.main_card_view) ;
            textView = (TextView) v.findViewById(R.id.main_card_text) ;
        }

    }

    /**
     * Inflating layout in ViewHolder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_cv, parent, false);
        viewHolder pvh = new viewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        holder.textView.setText(headings.get(position).heading);
    }

    /**
     * @return count of the no. of elements in the array.
     */
    @Override
    public int getItemCount() {
        return headings.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
