package com.example.topseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] seriesList = new String []{
                "Game of Thrones",
                "Breaking Bad",
                "La Casa de Papel",
                "The Punisher",
                "Prison Break",
                "Black Sails",
                "Last Kingdom",
                "Peaky Blinders",
                "Lucifer",
                "How I Met Your Mother",
                "House of Cards"
        };

        ListView seriesListView = (ListView) findViewById(R.id.seriesListView);

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, seriesList);

        seriesListView.setAdapter(adapter);

        seriesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String serieSelected = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, serieSelected, Toast.LENGTH_SHORT).show();
            }
        });

        seriesListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String serieSelected = parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, serieSelected, Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}
