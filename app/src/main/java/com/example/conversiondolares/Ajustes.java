package com.example.conversiondolares;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Ajustes extends AppCompatActivity {



    ImageButton Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        Next = (ImageButton) findViewById(R.id.Next);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Ajustes.this, colaboradores.class);
                startActivity(i);

            }
        });
    }
}