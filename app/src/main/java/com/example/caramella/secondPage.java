package com.example.caramella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondPage extends AppCompatActivity {
    Button btn3;
    Intent intent;
    EditText txtName,txtPhone,txtAddrees,txtEmail;

    SharedPreferences preferences;
    public static final String name="name";
    public static final String phone="phone";
    public static final String address="addrees";
    public static final String mail="mail";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        btn3=findViewById(R.id.btn3);
        txtName=findViewById(R.id.txtName);
        txtPhone=findViewById(R.id.txtPhone);
        txtEmail=findViewById(R.id.txtEmail);
        txtAddrees=findViewById(R.id.txtAddress);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                preferences=getSharedPreferences("key",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString(name,txtName.getText().toString());
                editor.putString(phone,txtPhone.getText().toString());
                editor.putString(address,txtAddrees.getText().toString());
                editor.putString(mail,txtEmail.getText().toString());
                txtName.setText("");
                txtPhone.setText("");
                txtAddrees.setText("");
                txtEmail.setText("");
                editor.apply();
                editor.commit();
                intent=new Intent(secondPage.this,fristPage.class);

                startActivity(intent);

            }
        });

    }
}