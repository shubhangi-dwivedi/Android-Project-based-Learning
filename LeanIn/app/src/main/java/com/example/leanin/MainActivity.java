package com.example.leanin;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name_input;
    EditText password_input;
    EditText email_input;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name_input=findViewById(R.id.name_input);
        password_input=findViewById(R.id.password_input);
        email_input=findViewById(R.id.email_input);
        btn_login=findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String name=name_input.getText().toString();
                String password=password_input.getText().toString();
                String email=email_input.getText().toString();

                String msg="Name: "+name+" Password: "+password+" Email: "+email;

                Intent dataIntent=new Intent(getApplicationContext(),SecondActivity.class);
                dataIntent.putExtra("message",msg); //adding data
                startActivity(dataIntent);

                Log.d("Message",msg);
            }
        });
    }
}