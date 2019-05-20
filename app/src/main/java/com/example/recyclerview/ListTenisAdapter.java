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

public class ListTenisAdapter extends RecyclerView.Adapter<ListTenisAdapter.CategoryViewHolder> {
    private Context context;

    private ArrayList<Tenis> getListTenis() {
        return listTenis;
    }

    public void setListTenis(ArrayList<Tenis> listTenis) {
        this.listTenis = listTenis;
    }

    private ArrayList<Tenis> listTenis;


    public ListTenisAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_tenis, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.tvTenisName.setText(getListTenis().get(position).getTenisName());
        holder.tvTenisFrom.setText(getListTenis().get(position).getTenisFrom());

        Glide.with(context)
                .load(getListTenis().get(position).getTenisPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgTenisPhoto);
    }

    @Override
    public int getItemCount() {
        return getListTenis().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvTenisName;
        TextView tvTenisFrom;
        ImageView imgTenisPhoto;

        CategoryViewHolder(View itemView) {
            super(itemView);
            tvTenisName = itemView.findViewById(R.id.tv_item_Tenisname);
            tvTenisFrom = itemView.findViewById(R.id.tv_item_Tenisfrom);
            imgTenisPhoto = itemView.findViewById(R.id.img_item_Tenisphoto);
        }
    }
}