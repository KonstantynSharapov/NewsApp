package com.makenews.view;


import android.content.Context;

import com.makenews.entity.News;
import com.makenews.room.room.AppDatabaseProvider;


import java.util.ArrayList;
import java.util.List;

public class NewsManager {

    public static final String ARG_CARD_ID = "arg card id";

    private static List<News> newsList = new ArrayList<>();

    private static boolean wasChanged = false;

    public static List<News> getBankCardList() {
        return newsList;
    }

    public static void initNewsList(Context context){
        newsList.addAll(AppDatabaseProvider.getInstance(context).getBankCardDao().getAll());
        setChanged(true);
    }

    public static boolean wasChanged() {
        return wasChanged;
    }

    public static void setChanged(boolean wasChanged) {
        NewsManager.wasChanged = wasChanged;
    }

    public static void addToList(News news, Context context){
        newsList.add(news);
        AppDatabaseProvider.getInstance(context)
                .getBankCardDao().insert(news);
    }

    public static void updateBankCard(int id, Context context){
        AppDatabaseProvider.getInstance(context)
                .getBankCardDao().update(newsList.get(id));
    }
}
