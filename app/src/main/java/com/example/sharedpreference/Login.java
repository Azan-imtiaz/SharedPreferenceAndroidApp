package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
   
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;   
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor ed=sp.edit();

                ed.putBoolean("flag",true);
                ed.apply();
                Intent iNext=new Intent(Login.this,Home.class);
                startActivity(iNext);




            }
        });
        
        
    }
}