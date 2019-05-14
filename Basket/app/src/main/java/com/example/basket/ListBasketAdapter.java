package com.example.basket;

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
    public ListBasketAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Basket> getListBasket() {
        return listBasket;
    }

    public void setListBasket(ArrayList<Basket> listBasket) {
        this.listBasket = listBasket;
    }

    private ArrayList<Basket> listBasket;

    @NonNull
    @Override
    public ListBasketAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_basket, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBasketAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListBasket().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListBasket().get(position).getRemarks());
        Glide.with(context)
                .load(getListBasket().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListBasket().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
