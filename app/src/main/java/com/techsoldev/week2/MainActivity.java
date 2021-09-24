package com.techsoldev.week2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nameEdittext, passwordEdittext;
    private Button loginBtn;
    String name = "f180243";
    String password = "1928";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        nameEdittext = (EditText) findViewById(R.id.name_edittext);
        passwordEdittext = (EditText) findViewById(R.id.password_edittext);

        loginBtn = (Button) findViewById(R.id.login_btn);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameEdittext.getText().toString().trim().equalsIgnoreCase("")) {
                    nameEdittext.setError("This field can not be blank");
                    nameEdittext.requestFocus();
                }
                else if (passwordEdittext.getText().toString().trim().equalsIgnoreCase("")) {
                    passwordEdittext.setError("This field can not be blank");
                    passwordEdittext.requestFocus();
                } else {
                    loginFun();
                }
            }

        });
    }

    private void loginFun() {

        String nametext = nameEdittext.getText().toString();
        String passwordtext = passwordEdittext.getText().toString();

        if (nametext.equals(name)) {
            if (passwordtext.equals(password)) {
                Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();


            } else {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Login failed")
                        .setMessage("incorrect password")
                        .setPositiveButton(android.R.string.ok, null)
                        .show();
            }
        } else {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Login failed")
                    .setMessage("incorrect name")
                    .setPositiveButton(android.R.string.ok, null)
                    .show();
        }

    }


}