package com.makenews.room.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.makenews.entity.News;


@Database(entities = {News.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract BankCardDao getBankCardDao();
}
