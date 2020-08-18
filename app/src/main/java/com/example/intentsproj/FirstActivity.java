package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button button;
    View view;
    EditText numeric1;
    EditText numeric2;
    Double num1;
    Double num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button = findViewById(R.id.btnok);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(FirstActivity.this, SecondActivity.class);
                num1 = Double.valueOf(numeric1.getText().toString());
                num2 = Double.valueOf(numeric2.getText().toString());
                i.putExtra("numeric1",num1);
                i.putExtra("numeric2",num2);
                startActivity(i);
            }
        });
        Context context = getApplicationContext(); //the context to use
        CharSequence message ="You just clicked the OK button"; //message
        int duration = Toast.LENGTH_SHORT; //Toast message duration
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);
    }


}