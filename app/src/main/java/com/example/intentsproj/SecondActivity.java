package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    int num1, num2;
    EditText ex1, ex2;
    TextView tx1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    //get user inputs
    public boolean getUserInputs(){
        //assigning editText
        ex1 = (EditText)findViewById(R.id.value1);
        ex2 = (EditText)findViewById(R.id.value2);
        //assigning textView
        tx1 = (TextView)findViewById(R.id.tx1);
        //Convert user inputs to string
        num1 = Integer.parseInt(ex1.getText().toString());
        num1 = Integer.parseInt(ex2.getText().toString());
        return true;
    }
    //method to do addition
    public void doAddition(View view){
        if(getUserInputs()){
            int sum = num1 + num2;
            tx1.setText(Integer.toString(sum));
        }
    }
    //method to do subtraction
    public void doSubtraction(View view){
        if(getUserInputs()){
            int sum = num1 - num2;
            tx1.setText(Integer.toString(sum));
        }
    }
    //method to do multiplication
    public void doMultiplication(View view){
        if(getUserInputs()){
            double sum = num1 *  num2;
            tx1.setText(Double.toString(sum));
        }
    }
    //method to do division
    public void doDivision(View view){
        if(getUserInputs()){
            double sum = num1 / num2;
            tx1.setText(Double.toString(sum));
        }
    }

}