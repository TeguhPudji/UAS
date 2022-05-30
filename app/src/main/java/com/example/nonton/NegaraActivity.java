package com.example.nonton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NegaraActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView = findViewById(R.id.listView);
        ListView list = (ListView) findViewById(R.id.listView);

        ArrayList<logo> arrayList = new ArrayList<>();
        arrayList.add(new logo(R.drawable.usa,"HOLYWOOD", ""));
        arrayList.add(new logo(R.drawable.eropa,"EROPA", ""));
        arrayList.add(new logo(R.drawable.india,"BOLYWOOD", ""));
        arrayList.add(new logo(R.drawable.korea,"KOREA", ""));
        arrayList.add(new logo(R.drawable.china,"MANDARIN", ""));
        arrayList.add(new logo(R.drawable.japan,"JEPANG", ""));
        arrayList.add(new logo(R.drawable.thailand,"THAILAND", ""));
        arrayList.add(new logo(R.drawable.indonesia,"LOKAL", ""));

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