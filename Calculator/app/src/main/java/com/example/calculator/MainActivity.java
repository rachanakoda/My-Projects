package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private Button add,sub,mul,div;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                if(s1.length() > 0 && s2.length() > 0){
                    int num1=Integer.parseInt(s1);
                    int num2=Integer.parseInt(s2);
                    int add = num1+num2;
                    tv.setText(Integer.toString(add));
                }
                else{
                    tv.setText("Invalid Input");
                }


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                if(s1.length() > 0 && s2.length() > 0) {
                    int num1=Integer.parseInt(s1);
                    int num2=Integer.parseInt(s2);
                    int sub = num1 - num2;
                    tv.setText(Integer.toString(sub));
                }
                else{
                    tv.setText("Invalid Input");
                }

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                if(s1.length() > 0 && s2.length() > 0)
                {
                    int num1=Integer.parseInt(s1);
                    int num2=Integer.parseInt(s2);
                    int mul= num1*num2;
                    tv.setText(Integer.toString(mul));}
                else{
                    tv.setText("Invalid Input");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();

                if(s1.length() > 0 && s2.length() > 0)
                {
                    int num1=Integer.parseInt(s1);
                    int num2=Integer.parseInt(s2);
                int div= num1/num2;
                tv.setText(Integer.toString(div)); }
                else{
                    tv.setText("Invalid Input");
                }
            }
        });

    }
}