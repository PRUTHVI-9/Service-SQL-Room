package com.example.musicplayer;

import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {roomclass.class},version = 3, autoMigrations = {@AutoMigration(from = 1, to = 3),@AutoMigration(from = 2,to=3)},exportSchema = false)
public abstract class RoomDB extends RoomDatabase {
    public abstract UserDao userDao();
}
