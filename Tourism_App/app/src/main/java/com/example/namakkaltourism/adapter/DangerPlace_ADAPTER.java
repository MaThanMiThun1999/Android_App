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
import com.example.namakkaltourism.activity.PlaceDetailsActivity;
import com.example.namakkaltourism.dataModel.LocationData;

import java.util.ArrayList;

public class DangerPlace_ADAPTER extends RecyclerView.Adapter<DangerPlace_ADAPTER.ViewHolder> {

    private final Context mycontext;
    private final ArrayList<LocationData> model;

    public DangerPlace_ADAPTER(Context mycontext, ArrayList<LocationData> models) {
        this.mycontext = mycontext;
        this.model = models;
    }

    @NonNull
    @Override
    public DangerPlace_ADAPTER.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myview = LayoutInflater.from(mycontext).inflate(R.layout.home_recyclerview_layout, null, true);
        return new DangerPlace_ADAPTER.ViewHolder(myview);
    }

    @Override
    public void onBindViewHolder(@NonNull DangerPlace_ADAPTER.ViewHolder holder, int position) {
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
            image = itemView.findViewById(R.id.city_image);
            name = itemView.findViewById(R.id.city_name);
            state = itemView.findViewById(R.id.state_name);
        }

        public void setData(LocationData data) {
            image.setImageResource(data.getImage());
            name.setText(data.getName());
            state.setText(data.getState());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DangerPlaceDetailsActivity.class);
                    intent.putExtra("putextra_city", data.getName());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}

