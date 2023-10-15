package com.example.page_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText f1;
    EditText p1;
    private Button button;
//first
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1=(EditText)findViewById(R.id.editTextText2);
        p1=(EditText)findViewById(R.id.editTextTextPassword2);
        button=(Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((p1.getText().toString().equals("1234")) && (f1.getText().toString().equals("Ankit"))){
                    Toast.makeText(MainActivity.this,"Login Successfull!!",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(MainActivity.this,Second.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Sorry!! Login failed",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}