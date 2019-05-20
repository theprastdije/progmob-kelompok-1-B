package com.example.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBasketAdapter extends RecyclerView.Adapter<ListBasketAdapter.CategoryViewHolder> {
    private Context context;

    private ArrayList<Basket> getListBasket() {
        return listBasket;
    }

    public void setListBasket(ArrayList<Basket> listBasket) {
        this.listBasket = listBasket;
    }

    private ArrayList<Basket> listBasket;


    public ListBasketAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_basket, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.tvBasketName.setText(getListBasket().get(position).getbasketName());
        holder.tvBasketFrom.setText(getListBasket().get(position).getBasketFrom());

        Glide.with(context)
                .load(getListBasket().get(position).getBasketPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgbasketPhoto);
    }

    @Override
    public int getItemCount() {
        return getListBasket().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvBasketName;
        TextView tvBasketFrom;
        ImageView imgbasketPhoto;

        CategoryViewHolder(View itemView) {
            super(itemView);
            tvBasketName = itemView.findViewById(R.id.tv_item_basketname);
            tvBasketFrom = itemView.findViewById(R.id.tv_item_basketfrom);
            imgbasketPhoto = itemView.findViewById(R.id.img_item_basketphoto);
        }
    }
}