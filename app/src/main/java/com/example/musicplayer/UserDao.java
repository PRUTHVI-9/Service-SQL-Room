package com.example.musicplayer;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


@Dao
public interface UserDao {
    @Query("SELECT * FROM roomclass")
    List<roomclass> getAll();

    @Insert
    void insertAll(roomclass users);

    @Insert
    void insertList(List<roomclass> users);
}
