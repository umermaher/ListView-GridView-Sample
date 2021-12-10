package com.example.listviewsample;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    List<Chat> chatList;
    Context context;
    public ListAdapter(Context context){
        Database db=new Database();
        chatList=db.getChatData();
        this.context=context;
    }
    @Override
    public int getCount() {
        return chatList.size();
    }

    @SuppressLint({"InflateParams", "ViewHolder"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.whatsapp_row,null);
        Chat chat=chatList.get(i);
        TextView name=v.findViewById(R.id.name);
        TextView time=v.findViewById(R.id.time);
        ImageView icon=v.findViewById(R.id.icon);
        ImageView callIcon =v.findViewById(R.id.callIcon);

        name.setText(chat.getName());
        time.setText(chat.getTime());
        icon.setImageResource(chat.getIcon());
        callIcon.setImageResource(chat.getCallIcon());
        return v;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}
