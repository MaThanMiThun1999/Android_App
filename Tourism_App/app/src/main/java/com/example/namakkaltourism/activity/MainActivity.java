package com.example.namakkaltourism.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.namakkaltourism.R;
import com.example.namakkaltourism.adapter.DangerPlace_ADAPTER;
import com.example.namakkaltourism.adapter.TouristPlace_ADAPTER;
import com.example.namakkaltourism.dataModel.LocationData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView touristdestinations;
    private RecyclerView touristattractions;
    private TextView seetouristdestinations;
    private TextView txtSeeAllDanger;
    private Button explore;
    private ArrayList<LocationData> placeList;
    private ArrayList<LocationData> dangerPlaceList;
    private TouristPlace_ADAPTER touristPlaceAdapter;
    private DangerPlace_ADAPTER dangerPlaceAdapter;
    private LinearLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explore = findViewById(R.id.exploretouristdestinations_button);
        seetouristdestinations = findViewById(R.id.seetouristdestinations_link);
        touristdestinations = findViewById(R.id.touristdestinations_recyclerview);
        touristattractions = findViewById(R.id.touristattractions_recyclerview);
        txtSeeAllDanger = findViewById(R.id.txtSeeAllDanger);

        placeList = new ArrayList<>();
        placeList.add(new LocationData(R.drawable.anjaneyar, "Anjaneyar Temple", "Namakkal"));
        placeList.add(new LocationData(R.drawable.ardhanare, "Arthanareeswarar Temple", "Tiruchengode"));
        placeList.add(new LocationData(R.drawable.kolli, "Kolli Hills", "Namakkal Town"));
        placeList.add(new LocationData(R.drawable.jedarpalayam, "Jedarpalayam Dam", "Kabilarmalai Panchayat"));

        touristPlaceAdapter = new TouristPlace_ADAPTER(this, placeList);
        manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        touristdestinations.setLayoutManager(manager);
        touristdestinations.setAdapter(touristPlaceAdapter);

        dangerPlaceList = new ArrayList<>();
        dangerPlaceList.add(new LocationData(R.drawable.hills, "Kolli Malai", "Namakkal"));
        dangerPlaceList.add(new LocationData(R.drawable.caves, "Siddhar Caves", "Kolli Hills"));
        dangerPlaceList.add(new LocationData(R.drawable.varadikallu, "Varadikallu", "Tiruchengode"));
        dangerPlaceList.add(new LocationData(R.drawable.boat, "Vasalurpatty Boat House", "Vasalurpatty"));

        dangerPlaceAdapter = new DangerPlace_ADAPTER(this, dangerPlaceList);
        manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        touristattractions.setLayoutManager(manager);
        touristattractions.setAdapter(dangerPlaceAdapter);

        explore.setOnClickListener(view -> startActivity(new Intent(this, AllPlaceListActivity.class)));
        seetouristdestinations.setOnClickListener(view -> startActivity(new Intent(this, AllPlaceListActivity.class)));
        txtSeeAllDanger.setOnClickListener(view -> startActivity(new Intent(this, DangerPlaceListActivity.class)));
    }
}