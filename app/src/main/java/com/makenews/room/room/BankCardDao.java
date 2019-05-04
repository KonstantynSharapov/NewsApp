package com.makenews.room.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.makenews.entity.News;


import java.util.List;

@Dao
public interface BankCardDao {

    @Query("SELECT * FROM News")
    List<News> getAll();

    @Insert
    void insert(News news);

    @Update
    void update(News news);
}
