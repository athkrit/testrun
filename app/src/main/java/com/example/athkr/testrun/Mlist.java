package com.example.athkr.testrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlist);

        final String[] Needlist = {"Shop1","Shop2","Shop3"};
        ListView listviewNeed = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,android.R.layout.simple_list_item_1, android.R.id.text1,Needlist);
        listviewNeed.setAdapter(adapter);
        listviewNeed.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent next = new Intent(Mlist.this, chat.class);
                String order;
                Bundle extras = getIntent().getExtras();
                order = extras.getString("mytext");
                next.putExtra("mytext",order+Needlist[position]);
                startActivity(next);
            }

        });
    }
}
