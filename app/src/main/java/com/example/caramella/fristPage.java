package com.example.caramella;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class fristPage extends AppCompatActivity {
    ListView Menu;
    Vector<Myitem>items;
     adapter adapter;
    List<Myitem>Myitem;
    int imgIcon1;
    int imgIcon2;
    String  dec1;
    String  dec2;
    Intent intent;
    Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist_page);
        Menu=findViewById(R.id.LM);

        Myitem=new ArrayList<>();
        items=new Vector<Myitem>();
        items.add(new Myitem(R.mipmap.icon1,R.mipmap.icon2,"The price per piece 40 pounds ","The price per piece 35 pounds"));
        items.add(new Myitem(R.mipmap.icon3,R.mipmap.icon4,"The price per piece 35 pounds","The price per piece 40 pounds"));
        items.add(new Myitem(R.mipmap.icon5,R.mipmap.icon6,"The price per piece 35 pounds","The price per piece 40 pounds"));
        items.add(new Myitem(R.mipmap.icon7,R.mipmap.icon8,"The price per piece 50 pounds ","The price per piece 60 pounds"));
        items.add(new Myitem(R.mipmap.icon9,R.mipmap.icon10,"The price per piece 50 pounds","The price per piece 50 pounds"));
        items.add(new Myitem(R.mipmap.icon11,R.mipmap.icon12,"The price per piece 10 pounds","The price per 5 pieces 50 pounds"));
        items.add(new Myitem(R.mipmap.icon13,R.mipmap.icon14,"The price per piece 40 pounds ","The price per piece 35 pounds"));
        items.add(new Myitem(R.mipmap.icon17,R.mipmap.icon16,"The price per piece 35 pounds","The price per piece 35 pounds"));
        items.add(new Myitem(R.mipmap.icon18,R.mipmap.icon19,"The price per piece 35 pounds","The price per piece 25 pounds"));
        items.add(new Myitem(R.mipmap.icon20,R.mipmap.icon21,"The price per piece 35 pounds ","The price per piece 25 pounds"));
        items.add(new Myitem(R.mipmap.icon22,R.mipmap.icon23,"The price per piece 25 pounds","The price per piece 35 pounds"));
        items.add(new Myitem(R.mipmap.icon24,R.mipmap.icon25,"The price per piece 25 pounds","The price per 3 pieces 50 pounds"));
        items.add(new Myitem(R.mipmap.icon26,R.mipmap.icon27,"The price per piece 40 pounds ","The Price per kilo 90 pounds"));
        items.add(new Myitem(R.mipmap.icon28,R.mipmap.icon29,"The price per piece 50 pounds","The price per 3 pieces 40 pounds"));
        items.add(new Myitem(R.mipmap.icon30,R.mipmap.icon31,"The price per piece 40 pounds","The price per piece 35 pounds"));
        items.add(new Myitem(R.mipmap.icon32,R.mipmap.icon34,"The price per piece 40 pounds ","The price per piece 40 pounds"));
        items.add(new Myitem(R.mipmap.icon35,R.mipmap.icon36,"The price per piece 45 pounds","The price per piece 40 pounds"));
        items.add(new Myitem(R.mipmap.icon37,R.mipmap.icon38,"The price per piece 40 pounds","The price per piece 40 pounds"));
        items.add(new Myitem(R.mipmap.icon39,R.mipmap.icon40,"The price per piece 40 pounds ","The price per piece 40 pounds"));
        adapter=new adapter(this,R.layout.list,R.id.textView4,items);

Menu.setAdapter(adapter);
Menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        imgIcon1=items.get(position).getImgIcon1();
        imgIcon2=items.get(position).getImgIcon2();
        dec1=items.get(position).getDec1();
        dec2=items.get(position).getDec2();
        intent=new Intent(getApplicationContext(),finaPage.class);
        intent.putExtra("imgIcon1",imgIcon1);
        intent.putExtra("imgIcon2",imgIcon2);
        intent.putExtra("dec1",dec1);
        intent.putExtra("dec2",dec2);

        startActivity(intent);
        finish();
    }
});
        btn8=findViewById(R.id.btn8);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(fristPage.this,threedPage.class);
                startActivity(intent);

            }
        });

    }
}