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

public class ListBTAdapter extends RecyclerView.Adapter<ListBTAdapter.CategoryViewHolder> {
    private Context context;

    private ArrayList<BT> getListBT() {
        return listBT;
    }

    public void setListBT(ArrayList<BT> listBT) {
        this.listBT = listBT;
    }

    private ArrayList<BT> listBT;


    public ListBTAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_bt, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.tvBTName.setText(getListBT().get(position).getBTName());
        holder.tvBTFrom.setText(getListBT().get(position).getBTFrom());

        Glide.with(context)
                .load(getListBT().get(position).getBTPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgBTPhoto);
    }

    @Override
    public int getItemCount() {
        return getListBT().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvBTName;
        TextView tvBTFrom;
        ImageView imgBTPhoto;

        CategoryViewHolder(View itemView) {
            super(itemView);
            tvBTName = itemView.findViewById(R.id.tv_item_BTname);
            tvBTFrom = itemView.findViewById(R.id.tv_item_BTfrom);
            imgBTPhoto = itemView.findViewById(R.id.img_item_BTphoto);
        }
    }
}