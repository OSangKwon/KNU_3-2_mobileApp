package com.example.share;

import android.widget.EditText;
import android.widget.CheckBox;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText id_input = (EditText)findViewById(R.id.id_input);
        EditText pw_input = (EditText)findViewById(R.id.pw_input);
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        ImageButton loginButton = (ImageButton)findViewById(R.id.loginButton);
        ImageButton signupButton = (ImageButton)findViewById(R.id.signupButton);
        ImageView id_box =(ImageView) findViewById(R.id.id_box);
        ImageView pw_box =(ImageView) findViewById(R.id.pw_box);
        ImageButton google_button = (ImageButton)findViewById(R.id.google_button);
        findViewById(R.id.id_input).bringToFront();
        findViewById(R.id.pw_input).bringToFront();



    }
}
