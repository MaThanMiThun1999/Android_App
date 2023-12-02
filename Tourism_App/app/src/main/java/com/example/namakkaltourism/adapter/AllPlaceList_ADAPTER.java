package com.example.namakkaltourism.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.namakkaltourism.R;
import com.example.namakkaltourism.activity.PlaceDetailsActivity;
import com.example.namakkaltourism.dataModel.LocationData;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class AllPlaceList_ADAPTER extends RecyclerView.Adapter<AllPlaceList_ADAPTER.ViewHolder> {

    private final Context context;
    private final ArrayList<LocationData> arrayList;

    public AllPlaceList_ADAPTER(Context context, ArrayList<LocationData> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public AllPlaceList_ADAPTER.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View showview = LayoutInflater.from(context).inflate(R.layout.tour_attractions_list_layout, null, true);
        return new AllPlaceList_ADAPTER.ViewHolder(showview);
    }

    @Override
    public void onBindViewHolder(@NonNull AllPlaceList_ADAPTER.ViewHolder holder, int position) {
        LocationData data = arrayList.get(position);
        holder.setData(data);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView city;
        TextView state;
        ShapeableImageView picture;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            city = itemView.findViewById(R.id.tourattr_name);
            state = itemView.findViewById(R.id.tourattr_state);
            picture = itemView.findViewById(R.id.tourattr_image);
        }

        public void setData(LocationData data) {
            city.setText(data.getName());
            state.setText(data.getState());
            picture.setImageResource(data.getImage());

            itemView.setOnClickListener(view -> {
                Intent intent = new Intent(itemView.getContext(), PlaceDetailsActivity.class);
                intent.putExtra("putextra_city", data.getName());
                intent.putExtra("putextra_state", data.getState());
                intent.putExtra("putextra_picture", data.getImage());
                itemView.getContext().startActivity(intent);
            });
        }
    }
}
