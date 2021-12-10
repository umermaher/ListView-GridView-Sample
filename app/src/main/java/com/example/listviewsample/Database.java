package com.example.listviewsample;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<Chat> getChatData(){
        List<Chat> chatList=new ArrayList<>();
        for(int i=0;i<10;i++) {
            Chat c1 = new Chat("N1", "9/12  10:00 pm", R.mipmap.ic_launcher, R.drawable.call);
            Chat c2 = new Chat("N2", "9/12  11:00 pm", R.drawable.bike, R.drawable.call);
            Chat c3 = new Chat("N3", "9/12  12:00 pm", R.drawable.subway, R.drawable.call);
            Chat c4 = new Chat("N4", "9/12  01:00 pm", R.drawable.man, R.drawable.call);

            chatList.add(c1);
            chatList.add(c2);
            chatList.add(c3);
            chatList.add(c4);
        }
        return chatList;
    }
}
