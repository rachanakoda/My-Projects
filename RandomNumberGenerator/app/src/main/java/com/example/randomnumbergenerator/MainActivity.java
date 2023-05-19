package com.example.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        tv=findViewById(R.id.tv);
        Random r =new Random();
        Set<Integer> temp=new HashSet<Integer>();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n;
                int bound=50;
                n= r.nextInt(bound);
                while(temp.contains(n) && temp.size() != bound)
                {
                    n= r.nextInt(bound);
                }
                if(temp.size()==bound)
                {
                    tv.setText("All the numbers generated are completed");
                }
                else {
                    temp.add(n);
                    tv.setText(n +"");
                }


            }
        });
    }
}