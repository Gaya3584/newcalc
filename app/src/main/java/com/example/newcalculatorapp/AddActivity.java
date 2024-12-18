package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {
    AppCompatButton b1;
    EditText et1,et2;
    TextView t1;
    String s1,s2,result;
    Integer num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        b1=(AppCompatButton) findViewById(R.id.bt3);
        et1=(EditText)findViewById(R.id.e3);
        et2=(EditText)findViewById(R.id.e4);
        t1=(TextView) findViewById(R.id.e5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                num1=Integer.parseInt(s1);
                num2=Integer.parseInt(s2);
                sum=num1+num2;
                result=String.valueOf(sum);
                t1.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

    }
}