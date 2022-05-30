package com.example.nonton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class GenreActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView = findViewById(R.id.listView);
        ListView list = (ListView) findViewById(R.id.listView);

        ArrayList<logo> arrayList = new ArrayList<>();
        arrayList.add(new logo(R.drawable.aksi,"AKSI", ""));
        arrayList.add(new logo(R.drawable.animation,"ANIMASi", ""));
        arrayList.add(new logo(R.drawable.dokumenter,"DOKUMENTER", ""));
        arrayList.add(new logo(R.drawable.fantasy,"FANTASY", ""));
        arrayList.add(new logo(R.drawable.horror,"HORROR", ""));
        arrayList.add(new logo(R.drawable.komedi,"KOMEDI", ""));
        arrayList.add(new logo(R.drawable.roman,"ROMANSA", ""));
        arrayList.add(new logo(R.drawable.scifi,"SCI FI", ""));

        logoAdapter logoAdapter = new logoAdapter(this,R.layout.list_row,arrayList);
        listView.setAdapter(logoAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //startActivity(new Intent(GenreActivity.this,PilihanActivity.class));
                }else if(position==1){
                    //startActivity(new Intent(GenreActivity.this,GenreActivity.class));
                }else if(position==2){
                    //startActivity(new Intent(MenuActivity.this,NegaraActivity.class));
                }else{
                    //startActivity(new Intent(MenuActivity.this,TahunActivity.class));
                }
            }
        });
    }

}