package com.example.listviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myList=findViewById(R.id.myList);
        ListAdapter adb=new ListAdapter(MainActivity.this);
        myList.setAdapter(adb);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "On click item", Toast.LENGTH_SHORT).show();
                Database db=new Database();
                List<Chat> chatList=db.getChatData();
                Chat chat=chatList.get(i);
                Intent intent=new Intent(MainActivity.this,Profile.class);
                intent.putExtra("name",chat.getName());
                intent.putExtra("time",chat.getTime());
                intent.putExtra("icon",String.valueOf(chat.getIcon()));
                startActivity(intent);
            }
        });
    }
}
//Step 1: Create XML tag and java object
//Step 2: Create frontend model of one row
//Step 3: Create backend model
//Step 4: Get data
//Step 5: Adapter class(Show data in ListView)
//Adapter: getData from (step 4) using model(step 3) show in LISTVIEW(step 1) using Layout(step 2)
