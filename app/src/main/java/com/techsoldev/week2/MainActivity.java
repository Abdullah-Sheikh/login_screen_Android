package com.techsoldev.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        password = (EditText) findViewById(R.id.password_edittxt);
        Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();

        //password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);

        //password.setSelection(password.length());

       // password.setTransformationMethod(new PasswordTransformationMethod());



    }

}