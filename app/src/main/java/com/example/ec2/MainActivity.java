package com.example.ec2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pas;
    Button i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user=findViewById(R.id.usuario);
        pas=findViewById(R.id.clave);
        i=findViewById(R.id.i);

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().equals("admin")&& pas.getText().toString().equals("admin")){
                    Intent intent=new Intent(MainActivity.this,Menu.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "BIENVENIDO AL MENU", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "INGRESA LOS DATOS QUE CORRESPONDEN", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}