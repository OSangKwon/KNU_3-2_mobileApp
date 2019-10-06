package com.example.share;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.CheckBox;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
public class LoginActivity extends AppCompatActivity {

    private EditText id_input, pw_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id_input = (EditText)findViewById(R.id.id_input);
        pw_input = (EditText)findViewById(R.id.pw_input);
        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox);
        ImageButton loginButton = (ImageButton)findViewById(R.id.loginButton);
        ImageButton signupButton = (ImageButton)findViewById(R.id.signupButton);
        ImageView id_box =(ImageView) findViewById(R.id.id_box);
        ImageView pw_box =(ImageView) findViewById(R.id.pw_box);
        ImageButton google_button = (ImageButton)findViewById(R.id.google_button);
        findViewById(R.id.id_input).bringToFront();
        findViewById(R.id.pw_input).bringToFront();
    }

    public void LoginCheck(View view){ // 로그인 확인, DB연동

        String check_id = id_input.getText().toString();
        String check_pw = pw_input.getText().toString();

        if(check_id.equals(check_pw)==true) {
            Intent intents = new Intent(this, HomeActivity.class);
            startActivity(intents);
        }

    }

    public void Sign_Up(View view){ // 회원가입 페이지

        String check_id = id_input.getText().toString();
        String check_pw = pw_input.getText().toString();

        if(check_id.equals(check_pw)==true) {
            Intent intents = new Intent(this, SignUpActivity.class);
            startActivity(intents);
        }

    }
}


