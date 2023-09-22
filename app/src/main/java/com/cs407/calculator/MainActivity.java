package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickAddFunction(View view){
        EditText myTextField1=(EditText) findViewById(R.id.myTextField1);
        EditText myTextField2=(EditText) findViewById(R.id.myTextField2);
        int number1=Integer.parseInt(myTextField1.getText().toString());
        int number2=Integer.parseInt(myTextField2.getText().toString());
        int result=number1+number2;
        goToActivity(String.valueOf(result));
    }

    public void clickMinusFunction(View view){
        EditText myTextField1=(EditText) findViewById(R.id.myTextField1);
        EditText myTextField2=(EditText) findViewById(R.id.myTextField2);
        int number1=Integer.parseInt(myTextField1.getText().toString());
        int number2=Integer.parseInt(myTextField2.getText().toString());
        int result=number1-number2;
        goToActivity(String.valueOf(result));
    }
    public void clickMultiplyFunction(View view){
        EditText myTextField1=(EditText) findViewById(R.id.myTextField1);
        EditText myTextField2=(EditText) findViewById(R.id.myTextField2);
        int number1=Integer.parseInt(myTextField1.getText().toString());
        int number2=Integer.parseInt(myTextField2.getText().toString());
        int result=number1*number2;
        goToActivity(String.valueOf(result));
    }
    public void clickDivideFunction(View view){
        EditText myTextField1=(EditText) findViewById(R.id.myTextField1);
        EditText myTextField2=(EditText) findViewById(R.id.myTextField2);
        int number1=Integer.parseInt(myTextField1.getText().toString());
        int number2=Integer.parseInt(myTextField2.getText().toString());
        if(number2==0){
            goToActivity("It should not be divided by zero");
        }else{
            int result=number1/number2;
            goToActivity(String.valueOf(result));
        }

    }
    public void goToActivity(String result){
        Intent intent=new Intent(this,calculation.class);
        intent.putExtra("number", result);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}