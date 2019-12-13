package com.bikash.softwaricaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);

        click = findViewById(R.id.btnLogin);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String un, pwd;

                un = username.getText().toString();
                pwd = password.getText().toString();

                if(un.equals("softwarica") && pwd.equals("coventry"))
                {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                    username.setText("");
                    password.setText("");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Invalid username and password", Toast.LENGTH_SHORT).show();
                    username.setText("");
                    password.setText("");
                }

            }
        });
    }
}
