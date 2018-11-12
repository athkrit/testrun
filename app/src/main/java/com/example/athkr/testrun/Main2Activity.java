package com.example.athkr.testrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String MMAN;
        String newString;

        Bundle extras = getIntent().getExtras();
        newString= extras.getString("text");

        if(newString.equals("Mar"))
        {
            final String[] Marlist = {"Order1","Order2","Order3"};
            ListView listviewMarket = (ListView) findViewById(R.id.listviewM);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1, android.R.id.text1,Marlist);
            listviewMarket.setAdapter(adapter);
            listviewMarket.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent next = new Intent(Main2Activity.this, chat.class);
                    String pos = String.valueOf(position+1);
                    next.putExtra("mytext",Marlist[position]);
                    startActivity(next);
                }

            });
        }
        else if (newString.equals("Pre"))
        {
            final String[] Marlist = {"Pre1","Pre2","Pre3"};
            ListView listviewMarket = (ListView) findViewById(R.id.listviewM);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1, android.R.id.text1,Marlist);
            listviewMarket.setAdapter(adapter);
            listviewMarket.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent next = new Intent(Main2Activity.this, chat.class);
                    String pos = String.valueOf(position+1);
                    next.putExtra("mytext",Marlist[position]);
                    startActivity(next);
                }

            });
        }
        else {
            final String[] Prelist = {"Request1","Request2","Request3"};
            ListView listviewP = (ListView) findViewById(R.id.listviewM);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1, android.R.id.text1,Prelist);
            listviewP.setAdapter(adapter);
            listviewP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent next = new Intent(Main2Activity.this, Mlist.class);
                    next.putExtra("mytext",Prelist[position]);
                    startActivity(next);
                }

            });
        }

    }
}
