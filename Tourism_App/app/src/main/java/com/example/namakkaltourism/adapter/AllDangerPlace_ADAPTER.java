package com.example.namakkaltourism.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.namakkaltourism.R;
import com.example.namakkaltourism.activity.DangerPlaceDetailsActivity;
import com.example.namakkaltourism.dataModel.LocationData;

import java.util.ArrayList;

public class AllDangerPlace_ADAPTER extends RecyclerView.Adapter<AllDangerPlace_ADAPTER.ViewHolder> {

    private final Context mycontext;
    private final ArrayList<LocationData> model;

    public AllDangerPlace_ADAPTER(Context mycontext, ArrayList<LocationData> models) {
        this.mycontext = mycontext;
        this.model = models;
    }

    @NonNull
    @Override
    public AllDangerPlace_ADAPTER.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview = LayoutInflater.from(mycontext).inflate(R.layout.tour_attractions_list_layout, null, true);
        return new AllDangerPlace_ADAPTER.ViewHolder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull AllDangerPlace_ADAPTER.ViewHolder holder, int position) {
        LocationData data = model.get(position);
        holder.setData(data);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name;
        TextView state;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.tourattr_image);
            name = itemView.findViewById(R.id.tourattr_name);
            state = itemView.findViewById(R.id.tourattr_state);
        }

        public void setData(LocationData data) {
            image.setImageResource(data.getImage());
            name.setText(data.getName());
            state.setText(data.getState());
            itemView.setOnClickListener(view -> {
                Intent intent = new Intent(itemView.getContext(), DangerPlaceDetailsActivity.class);
                intent.putExtra("putextra_city", data.getName());
                itemView.getContext().startActivity(intent);
            });
        }
    }
}