package com.example.caramella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class threedPage extends AppCompatActivity {
TextView txtdecz,txtdeczz,txtdeczzz,txtdecz3,txtdecz4,txtdecz5;

Button sucsucsseful;
    SharedPreferences preferences;

//    public static final String dec11="dec1";
//    public static final String dec21="dec2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threed_page);
//        txtdecz=findViewById(R.id.txtdecz);
//        txtdeczz=findViewById(R.id.txtdeczz);
        txtdeczzz=findViewById(R.id.txtdeczzz);
        txtdecz3=findViewById(R.id.txtdecz3);
        txtdecz4=findViewById(R.id.txtdesz4);
        txtdecz5=findViewById(R.id.txtdec5);
       // btnz=findViewById(R.id.btnz);
        sucsucsseful=findViewById(R.id.sucsseful);


        preferences=getSharedPreferences("key",Context.MODE_PRIVATE);
        txtdeczzz.setText(preferences.getString(secondPage.name,"N/A"));
        txtdecz3.setText(preferences.getString(secondPage.phone,"N/A"));
        txtdecz4.setText(preferences.getString(secondPage.address,"N/A"));
        txtdecz5.setText(preferences.getString(secondPage.mail,"N/A"));
        sucsucsseful.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(threedPage.this,finaPage.class);
                startActivity(intent);
            }
        });




//        btnz.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//               //preferences=getPreferences(Context.MODE_PRIVATE);
////                txtdecz.setText(preferences.getString("dec11","N/A"));
////                txtdeczz.setText(preferences.getString("dec21","N/A"));
//
//
//            }
//        });
    }
}