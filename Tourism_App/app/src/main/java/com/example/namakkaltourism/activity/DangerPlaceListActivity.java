package com.example.namakkaltourism.activity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.namakkaltourism.R;
import com.example.namakkaltourism.adapter.AllDangerPlace_ADAPTER;
import com.example.namakkaltourism.dataModel.LocationData;

import java.util.ArrayList;

public class DangerPlaceListActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private ImageView imageViewBack;
    private LinearLayoutManager manager;
    private AllDangerPlace_ADAPTER adapter;
    private ArrayList<LocationData> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danger_place_list);
        recycler = findViewById(R.id.tourattr_recycler);
        imageViewBack = findViewById(R.id.imageViewBack);

        array = new ArrayList<>();
        array.add(new LocationData(R.drawable.kolli, "Kolli Hills", "Namakkal District"));
        array.add(new LocationData(R.drawable.caves, "Siddhar Caves", "Kolli Hills"));
        array.add(new LocationData(R.drawable.varadikallu, "Varadikallu", "Tiruchengode"));
        array.add(new LocationData(R.drawable.boat, "Vasalurpatty Boat House", "Vasalurpatty"));
        array.add(new LocationData(R.drawable.selur, "Seeku Parai View Point", "Kolli Hills"));
        array.add(new LocationData(R.drawable.waterfalls, "Agaya Gangai Waterfalls", "Kolli Hills"));

        adapter = new AllDangerPlace_ADAPTER(this, array);
        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(manager);
        recycler.setAdapter(adapter);
        imageViewBack.setOnClickListener(v -> onBackPressed());
    }
}