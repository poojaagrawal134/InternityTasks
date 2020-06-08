package com.example.internitytasks.Database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.net.UnknownServiceException;
import java.util.List;
@Dao
public interface UserEntityDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(UserEntity userEntity);



    @Query("SELECT * FROM users")
    LiveData<List<UserEntity>> getAllusers();
    @Query("DELETE FROM users")
    void deleteAll(); // for testing
}
