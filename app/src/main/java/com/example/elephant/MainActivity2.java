package com.example.elephant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void click(View view) {

        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }

    public void topics(View view) {
        Intent some=new Intent(this,MainActivity3.class);
        startActivity(some);
    }


}