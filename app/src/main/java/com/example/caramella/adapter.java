package com.example.caramella;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.List;
import java.util.Vector;

public class adapter extends ArrayAdapter {
    Context _context;
    Vector<Myitem>myitems;

    SharedPreferences preferences;

    public adapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List items) {
        super(context, resource, textViewResourceId, items);
        _context=context;
        myitems= (Vector<Myitem>) items;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup Menu) {
        View list=convertView;
        LayoutInflater inflater= (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        list=inflater.inflate(R.layout.list,Menu,false);

        ImageView imgIcon1=list.findViewById(R.id.img1);
        ImageView imgIcon2=list.findViewById(R.id.img2);
        TextView dec1=list.findViewById(R.id.textView4);
        TextView dec2=list.findViewById(R.id.textView5);
        Button button1=list.findViewById(R.id.btn1);
        Button button2=list.findViewById(R.id.btn2);



        imgIcon1.setImageResource(myitems.get(position).getImgIcon1());
        imgIcon2.setImageResource(myitems.get(position).getImgIcon2());
        dec1.setText(myitems.get(position).getDec1());
        dec2.setText(myitems.get(position).getDec2());
        button1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                Toast.makeText(_context, "Add To Cart", Toast.LENGTH_LONG).show();

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(_context, "Add To Cart", Toast.LENGTH_LONG).show();

            }


        });

        return list;

    }
}
