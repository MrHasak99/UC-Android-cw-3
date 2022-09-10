package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button mail = findViewById(R.id.buttonmail);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String age = bundle.getString("age");

        TextView textname = findViewById(R.id.textViewname2);
        TextView textage = findViewById(R.id.textViewage2);

        textname.setText(name);
        textage.setText(age);

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL , "hamad_alkhalaf_99@hotmail.com");

                startActivity(Intent.createChooser(intent, "Choose Title"));
            }
        });
    }
}