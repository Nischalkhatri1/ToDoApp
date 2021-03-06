package com.example.todomvvm.database;

import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class} , version = 1, exportSchema = false)
public abstract class UserDataBase extends RoomDatabase {

    private static final String LOG_TAG = UserDataBase.class.getSimpleName();
    private static final Object LOCK = new Object();
    private static String DATABASE_NAME = "User";
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(1);

    private static UserDataBase sInstance;
    public static UserDataBase getInstance(Context context){
        if(sInstance == null){
            synchronized (LOCK){
                Log.d(LOG_TAG, "Creating a new database instance");
                sInstance = Room.databaseBuilder(context.getApplicationContext(),
                        UserDataBase.class, UserDataBase.DATABASE_NAME)
                        //.allowMainThreadQueries()
                        .build();
            }
        }
        Log.d(LOG_TAG, "Getting the database instance");
        return sInstance;
    }

    public abstract UserDAO getUserDAO();

}
