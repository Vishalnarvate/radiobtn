package com.example.radiobuttons;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.GroupID);
        //radioButton=(RadioButton)findViewById((R.id.maybeID));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton=(RadioButton) findViewById(i);
                switch (radioButton.getId()){
                    case R.id.yesID: {
                   Log.d("RD", "WELCOME !!1");
                    }
                    case R.id.noID :{
                        Log.d("RD", "OK !!1");
                    }
                    case R.id.maybeID : {
                        Log.d("RD", "What ? !!1");
                    }

                }

            }
        });
    }
}