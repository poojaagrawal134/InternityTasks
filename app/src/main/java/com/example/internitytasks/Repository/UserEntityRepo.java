package com.example.internitytasks.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.internitytasks.Database.UserEntity;
import com.example.internitytasks.Database.UserEntityDAO;
import com.example.internitytasks.Database.UserEntityRoomDatabase;

import java.util.List;

public class UserEntityRepo {
    private UserEntityDAO muserEntityDao;
    private LiveData<List<UserEntity>> mallusers;

    public UserEntityRepo(Application application) {
        UserEntityRoomDatabase db = UserEntityRoomDatabase.getDatabase(application);
        muserEntityDao = db.userEntityDAO();
        mallusers = muserEntityDao.getAllusers();
    }
    public LiveData<List<UserEntity>> getAllTasks() {
        return mallusers;
    }
    public void insert(final UserEntity userEntity) {
        UserEntityRoomDatabase.databaseWriteExecutor.execute(() -> {
            muserEntityDao.insertUser(userEntity);
        });
    }


}
