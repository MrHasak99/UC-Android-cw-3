package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textname = findViewById(R.id.editTextTextName);
        EditText textage = findViewById(R.id.editTextTextAge);

        Button next = findViewById(R.id.buttonnext);

    next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String a = textname.getText().toString();
            String b = textage.getText().toString();

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("name", a);
            intent.putExtra("age", b);

            startActivity(intent);
            }
        });
    }
}