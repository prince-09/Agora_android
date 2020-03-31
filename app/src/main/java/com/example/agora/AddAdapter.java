package com.example.agora;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AddAdapter extends RecyclerView.Adapter<AddAdapter.myViewholder>{
    List<String> strings;
    Context context;

    public AddAdapter(List<String> strings, Context context){
        this.strings = strings;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_name_item,parent,false);
        return new AddAdapter.myViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewholder holder, int position) {
        holder.candidate.setText(strings.get(position));
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    public class myViewholder extends RecyclerView.ViewHolder{
        TextView candidate;
        public myViewholder(@NonNull View itemView) {
            super(itemView);
            candidate=itemView.findViewById(R.id.candidate);
        }
    }
}
