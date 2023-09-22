package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        int result = Integer.parseInt(integer1.getText().toString())
                + Integer.parseInt(integer2.getText().toString());
        goToAnswer(String.valueOf(result));
    }

    public void subtractFunction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        int result = Integer.parseInt(integer1.getText().toString())
                - Integer.parseInt(integer2.getText().toString());
        goToAnswer(String.valueOf(result));
    }

    public void multiplyFunction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        int result = Integer.parseInt(integer1.getText().toString())
                * Integer.parseInt(integer2.getText().toString());
        goToAnswer(String.valueOf(result));
    }

    public void divideFunction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        String result = "";
        if(Integer.parseInt(integer2.getText().toString()) ==0){
            result = "Cannot divide by zero!";
        }else {
            int num = Integer.parseInt(integer1.getText().toString())
                    / Integer.parseInt(integer2.getText().toString());
            result = String.valueOf(num);
        }
        goToAnswer(result);
    }
    public void goToAnswer(String result){
        Intent intent = new Intent(this, Answer.class);
        intent.putExtra("message", result);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}