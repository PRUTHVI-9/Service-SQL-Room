package com.example.musicplayer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class roomclass {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int uid;

    @ColumnInfo(name = "First_name")
    public String firstname;

    @ColumnInfo(name = "Last_name")
    public String lastname;

    @ColumnInfo(name = "Mobile_number")
    public String mobile;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
