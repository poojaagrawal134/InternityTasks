package com.example.internitytasks.Database;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "users")
public class UserEntity {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "userid")
    public int mId;

    @ColumnInfo(name = "username")
    public String mUserName;



    @ColumnInfo(name = "Age")
    public String mAge;
    @ColumnInfo(name = "Phone_Number")
    public String mPhone;
    public UserEntity(@NonNull String mUserName, @NonNull String mAge,@NonNull String mPhone) {
        this.mUserName = mUserName;
        this.mAge = mAge;
        this.mPhone = mPhone;
    }
    @Ignore
    public UserEntity(int mId,@NonNull String mUserName, @NonNull String mAge,@NonNull String mPhone) {
        this.mId = mId;
        this.mUserName = mUserName;
        this.mAge = mAge;
        this.mPhone = mPhone;
    }

    public int getmId() {
        return this.mId;
    }

    public String getmUserName() {
        return this.mUserName;
    }

    public String getmAge() {
        return this.mAge;
    }

    public String getmPhone() {
        return this.mPhone;
    }
}
