package com.makenews.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.makenews.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ContentNews extends Fragment {
    private static final String ARG_POSITION = "position";
    @BindView(R.id.tv_news_content)
    TextView tvNewsContent;

    public static ContentNews newInstance(int position) {
        Bundle args = new Bundle();
        args.putInt(ARG_POSITION, position);

        ContentNews fragment = new ContentNews();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.news_content, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvNewsContent.setText("Привет Коля!");
    }
}
