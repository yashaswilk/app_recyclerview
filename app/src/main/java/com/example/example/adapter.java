package com.example.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.myviewholder> {
    List<president> presidentList;
    Context context;

    public adapter(List<president> presidentList, Context context) {
        this.presidentList = presidentList;
        this.context = context;
    }

    @NonNull

    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.one,parent,false);
        myviewholder holder=new myviewholder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull  adapter.myviewholder holder, int position) {
holder.tv_name.setText(presidentList.get(position).getName());
holder.tv_date.setText(String.valueOf(presidentList.get(position).getDate()));
    }


    @Override
    public int getItemCount() {
        return presidentList.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_date;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            tv_date=itemView.findViewById(R.id.tv_date);
            tv_name=itemView.findViewById(R.id.tv_name);
        }

    }
}
