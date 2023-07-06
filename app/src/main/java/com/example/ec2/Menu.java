package com.example.ec2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



    }
    public void sigue(View view){
        Intent sigue=new Intent(this,Mapa.class);
        startActivity(sigue);

    }
    public void sigue2(View view) {
        Intent sigue2 = new Intent(this, Camara.class);
        startActivity(sigue2);
    }
        public void atras(View view) {
        Intent atras = new Intent(this, MainActivity.class);
        startActivity(atras);
    }
}