package com.example.namakkaltourism.activity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.namakkaltourism.R;
import com.example.namakkaltourism.adapter.AllPlaceList_ADAPTER;
import com.example.namakkaltourism.dataModel.LocationData;

import java.util.ArrayList;

public class AllPlaceListActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private ImageView imageViewBack;
    private LinearLayoutManager manager;
    private AllPlaceList_ADAPTER adapter;
    private ArrayList<LocationData> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_attractions_list);
        recycler = findViewById(R.id.tourattr_recycler);
        imageViewBack = findViewById(R.id.imageViewBack);

        array = new ArrayList<>();
        array.add(new LocationData(R.drawable.anjaneyar, "Anjaneyar Temple", "Namakkal"));
        array.add(new LocationData(R.drawable.ardhanare, "Arthanareeswarar Temple", "Tiruchengode"));
        array.add(new LocationData(R.drawable.kolli, "Kolli Hills", "Namakkal District"));
        array.add(new LocationData(R.drawable.jedarpalayam, "Jedarpalayam Dam", "Kabilarmalai Panchayat"));
        array.add(new LocationData(R.drawable.selur, "Seeku Parai View Point", "Kolli Malai"));
        array.add(new LocationData(R.drawable.waterfalls, "Agaya Gangai Waterfalls", "Kolli Hills"));
        array.add(new LocationData(R.drawable.garden, "Botanical Garden", "Vasalur Patti"));
        array.add(new LocationData(R.drawable.sankagiri, "Sankagiri Fort", "Tiruchengode"));
        array.add(new LocationData(R.drawable.udaipur, "Arappaleeswarar Temple", "Kolli Malai"));
        array.add(new LocationData(R.drawable.puliancholai, "Puliancholai", "Puliansolai R F"));

        adapter = new AllPlaceList_ADAPTER(this, array);
        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(manager);
        recycler.setAdapter(adapter);
        imageViewBack.setOnClickListener(v -> onBackPressed());
    }
}