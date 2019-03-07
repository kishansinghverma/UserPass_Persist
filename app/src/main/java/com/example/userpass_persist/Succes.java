package com.example.userpass_persist;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Succes extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succes);
        tv=findViewById(R.id.textView2);
        SharedPreferences sp=getSharedPreferences("com.example.userpass_persist", MODE_PRIVATE);
        String s_user=sp.getString("user", "user");
        tv.setText(s_user);
    }
}
