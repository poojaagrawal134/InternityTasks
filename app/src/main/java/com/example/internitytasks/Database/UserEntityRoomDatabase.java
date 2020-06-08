package com.example.internitytasks.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {UserEntity.class}, version = 2, exportSchema = false)
public abstract class UserEntityRoomDatabase extends RoomDatabase {
    public abstract UserEntityDAO userEntityDAO();
    private static volatile UserEntityRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static UserEntityRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (UserEntityRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            UserEntityRoomDatabase.class, "user_Database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
