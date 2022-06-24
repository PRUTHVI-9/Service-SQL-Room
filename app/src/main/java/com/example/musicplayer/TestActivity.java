package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TestActivity extends AppCompatActivity {
    EditText first,last,number;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        first=findViewById(R.id.first);
        last=findViewById(R.id.last);
        number=findViewById(R.id.number);
        save=findViewById(R.id.save);

        RoomDB db = Room.databaseBuilder(getApplicationContext(),
                RoomDB.class, "MyDB").fallbackToDestructiveMigration().allowMainThreadQueries().build();

        UserDao userDao = db.userDao();
        List<roomclass> users = userDao.getAll();

        userDao.getAll().size();
        Log.e("TAG", "onCreate: "+userDao.getAll().size());



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first.getText().toString().isEmpty()){
                    Toast.makeText(TestActivity.this, "first name should not be empty", Toast.LENGTH_SHORT).show();
                }
                if (last.getText().toString().isEmpty()){
                    Toast.makeText(TestActivity.this, "last name should not be empty", Toast.LENGTH_SHORT).show();
                }
                if (number.getText().toString().isEmpty()){
                    Toast.makeText(TestActivity.this, "mobile no should not be empty", Toast.LENGTH_SHORT).show();
                }

                roomclass user = new roomclass();
                user.setFirstname(first.getText().toString());
                user.setLastname(last.getText().toString());
                user.setMobile(number.getText().toString());
                db.userDao().insertAll(user);
                Log.e("TAG", "onClick: "+db.userDao().getAll().size() );
            }
        });


    }


}