package com.example.internitytasks.Models;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.internitytasks.Database.UserEntity;
import com.example.internitytasks.Repository.UserEntityRepo;

import java.util.List;

public class UserEntityViewModel extends AndroidViewModel {
    public UserEntityRepo mRepository;
    private LiveData<List<UserEntity>> mallusers;

    public UserEntityViewModel(@NonNull Application application) {
        super(application);
        mRepository = new UserEntityRepo(application);
        mallusers = mRepository.getAllTasks();
    }
    public LiveData<List<UserEntity>> getMallusers() {
        return mallusers;
    }

    public void insert(UserEntity userEntity) {
        mRepository.insert(userEntity);
    }

}
