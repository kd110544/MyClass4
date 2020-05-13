package com.example.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class ActList extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] users ={"1", "2","1", "2","1", "2","1", "2","1", "2","1", "2","1", "2","1", "2",
                "1", "2","1", "2","1", "2","1", "2","1", "2","1", "2","1", "2","1", "2",
                "1", "2","1", "2","1", "2","1", "2","1", "2","1", "2","1", "2"};

        ListAdapter adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                users);
        setListAdapter(adapter);

        //int pos = this.getSelectedItemPosition();

        //Bundle bund = new Bundle();
        //bund.putString("CCC", String.valueOf(pos));
        //Intent intent = new Intent();
        //intent.putExtras(bund);

        //setResult(0,intent);
        //finish();



    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Log.i("List_Demo", String.valueOf(position));
    }
}
