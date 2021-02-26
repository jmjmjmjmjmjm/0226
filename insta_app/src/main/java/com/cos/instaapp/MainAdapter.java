package com.cos.instaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {


    private List<Data> itemList = new ArrayList<>();

    public MainAdapter(List<Data> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyckerview_item,parent,false);
        ViewHolder holder= new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        holder.image.setImageResource(itemList.get(position).getImage());
        holder.username.setText(itemList.get(position).getUsername());
        holder.content.setText(itemList.get(position).getContent());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView username;
        private TextView content;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.image=(ImageView) itemView.findViewById(R.id.img);
            this.username=(TextView)itemView.findViewById(R.id.username);
            this.content=(TextView)itemView.findViewById(R.id.content);
        }
    }

}
