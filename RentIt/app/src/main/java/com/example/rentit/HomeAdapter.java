package com.example.rentit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private List<HomeModelClass> modelClassList;

    public HomeAdapter(List<HomeModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int img = modelClassList.get(position).getImage();
        String name = modelClassList.get(position).getOwnerName();
        String location = modelClassList.get(position).getLocation();
        holder.setData(img, name, location);

    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView ownImg;
        private TextView name;
        private TextView location;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ownImg = itemView.findViewById(R.id.image_id);
            name = itemView.findViewById(R.id.name_id);
            location = itemView.findViewById(R.id.genre_id);

        }

        public void setData(int img, String Oname, String Olocation) {
            ownImg.setImageResource(img);
            name.setText(Oname);
            location.setText(Olocation);

        }
    }
}
