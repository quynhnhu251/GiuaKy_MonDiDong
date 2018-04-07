package com.example.admin.quanlythuchi;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    ListView listView;

    public  static ArrayList<Data_Money> listDS = new ArrayList<Data_Money>();

    Data_Money adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        Adapter_Info adapter_info = new Adapter_Info(this, R.layout.list_ds, listDS);
        listView.setAdapter(adapter_info);

    }

    protected void anhXa(){
        floatingActionButton = findViewById(R.id.fab);
        listView = findViewById(R.id.listView);
    }
}
