package com.example.newcalculatorapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {

    Button gto,b1;
    EditText et1,et2;

    String getNum1,getNum2,result;
    int num1,num2,sum;
    TextView tv;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        et1=(EditText)findViewById(R.id.n1) ;
        et2=(EditText)findViewById(R.id.n2);
        gto=(Button) findViewById(R.id.got);
        tv=(TextView)findViewById(R.id.res);
        gto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(obj2);
            }
        });
        b1=(Button)findViewById(R.id.ad);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

    }
}