package com.makenews.view;



import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.makenews.R;


public class NewsAdapter extends RecyclerView.Adapter<NewsHolder> {

    public interface IDetailCardListener{
        void openDetailCardFragment(int i);
    }

    private IDetailCardListener listener;

    public NewsAdapter(IDetailCardListener listener){
        this.listener = listener;
    }

    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view =
                LayoutInflater.from(viewGroup.getContext())
                        .inflate(
                                R.layout.list_item_news,
                                viewGroup,
                                false);
        return new NewsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsHolder NewsViewHolder, int i) {

        final int id = i;
        NewsViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener==null)
                    throw new RuntimeException("empty detail card listener");
                listener.openDetailCardFragment(id);
            }
        });
    }

    @Override
    public int getItemCount() {
        return NewsManager.getBankCardList().size();
    }

}
