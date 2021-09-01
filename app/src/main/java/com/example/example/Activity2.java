package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class Activity2 extends AppCompatActivity {
    Button ok,can;
    List<president> presidentList;
    EditText name,date;
    myapplication myapplication=(myapplication)this.getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        presidentList=myapplication.getPresidentList();
        ok=findViewById(R.id.ok);
        can=findViewById(R.id.can);
        name=findViewById(R.id.name);
        date=findViewById(R.id.date);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextid=myapplication.getNextid();
                president newpresident=new president(nextid,name.getText().toString(),Integer.parseInt(date.getText().toString()));
                presidentList.add(newpresident);
                myapplication.setNextid(nextid++);
                Intent intent=new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}