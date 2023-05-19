package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText et;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        et=findViewById(R.id.et);
        tv=findViewById(R.id.tv);
        String MY_PREF_FILENAME="com.example.sharedpreferences";
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String ip_name= et.getText().toString();
              if(ip_name.length() > 0) {
                  SharedPreferences.Editor editor = getSharedPreferences( "com.example.sharedpreferences",MODE_PRIVATE).edit();
                  editor.putString("name", ip_name);
                  editor.apply();
                  tv.setText("Welcome " + ip_name);
              }
              else
              {

              }


            }
        });
    }
}