package com.example.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="presidents app";
    Button add;
    myapplication myapplication= (com.example.example.myapplication) this.getApplication();

List<president>presidentlist;

private RecyclerView recyclerView;
private RecyclerView.Adapter mAdaptar;
private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presidentlist=myapplication.getPresidentList();

        Log.d(TAG,"onCreate"+presidentlist.toString());
        Toast.makeText(this,"count="+ presidentlist.size(),Toast.LENGTH_SHORT).show();

       add=findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,com.example.example.Activity2.class);
                startActivity(intent);
            }
        });
recyclerView=findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
       mAdaptar=new adapter(presidentlist,MainActivity.this);
        recyclerView.setAdapter(mAdaptar);
    }


}