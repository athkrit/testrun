package com.example.athkr.testrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Market = (Button)findViewById(R.id.btnMarket);
        Market.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Market = new Intent(MainActivity.this ,Main2Activity.class);
                String x = "Mar";
                Market.putExtra("text",x);
                startActivity(Market);
            }
        });

        Button Pre = (Button)findViewById(R.id.btnPre);
        Pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Pre = new Intent(MainActivity.this ,Main2Activity.class);
                String x = "Pre";
                Pre.putExtra("text",x);
                startActivity(Pre);
            }
        });

        Button Need = (Button)findViewById(R.id.btnNeed);
        Need.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NeedN = new Intent(MainActivity.this ,Main2Activity.class);
                String x = "Need";
                NeedN.putExtra("text",x);
                startActivity(NeedN);
            }
        });
    }


}
