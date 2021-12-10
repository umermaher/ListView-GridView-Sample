package com.example.listviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    TextView name,time;
    ImageView icon,callIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name=findViewById(R.id.name);
        time=findViewById(R.id.time);
        icon=findViewById(R.id.icon);

        name.setText(getIntent().getStringExtra("name"));
        time.setText(getIntent().getStringExtra("time"));
        int i=Integer.parseInt(getIntent().getStringExtra("icon"));
        try {
            icon.setImageResource(i);
        }
        catch (Exception e){
            Toast.makeText(this, "No icon matched", Toast.LENGTH_SHORT).show();
        }
    }
}