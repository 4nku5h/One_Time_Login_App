package com.example.hackermr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText et_phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
           et_phone_number=findViewById(R.id.et_phone_number);
    }

    void Register_btn_event(View view){
   UserData user_data= new UserData(this);
   user_data.save_phone(et_phone_number.getText().toString());
    finish();
    }
}
