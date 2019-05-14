package com.example.bulutangkis;

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

public class ListBulutangkisAdapter extends RecyclerView.Adapter<ListBulutangkisAdapter.CategoryViewHolder> {
    public ListBulutangkisAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public ArrayList<Bulutangkis> getListBulutangkis() {
        return listBulutangkis;
    }

    public void setListBulutangkis(ArrayList<Bulutangkis> listBulutangkis) {
        this.listBulutangkis = listBulutangkis;
    }

    private ArrayList<Bulutangkis> listBulutangkis;

    @NonNull
    @Override
    public ListBulutangkisAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_bulutangkis, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListBulutangkisAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListBulutangkis().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListBulutangkis().get(position).getRemarks());
        Glide.with(context)
                .load(getListBulutangkis().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListBulutangkis().size();
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
