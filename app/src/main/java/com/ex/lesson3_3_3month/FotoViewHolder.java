package com.ex.lesson3_3_3month;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FotoViewHolder extends RecyclerView.ViewHolder {
    private ImageView imView;

    public FotoViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imView = imView.findViewById(R.id.tv_foto);
    }
    public void bindImage(int imageRes){
        imView.setImageResource(imageRes);
    }

    public void bindImage(Drawable drawable){
        imView.setImageDrawable(drawable);
    }


    }



