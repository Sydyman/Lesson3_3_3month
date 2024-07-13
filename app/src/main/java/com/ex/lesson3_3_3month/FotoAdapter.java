package com.ex.lesson3_3_3month;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FotoAdapter extends RecyclerView.Adapter<FotoViewHolder> {
    private List<Integer> imageResourceIds;

    public FotoAdapter(List<Integer> imageResourceIds) {
        this.imageResourceIds = imageResourceIds;
    }

    @NonNull
    @Override
    public FotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_foto, parent, false); // Replace with your item layout
        return new FotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FotoViewHolder holder, int position) {
        int imageResId = imageResourceIds.get(position);
        holder.bindImage(imageResId);
    }

    @Override
    public int getItemCount() {
        return imageResourceIds.size();
    }
}

