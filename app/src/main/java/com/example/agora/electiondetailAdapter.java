package com.example.agora;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class electiondetailAdapter extends RecyclerView.Adapter<electiondetailAdapter.myview> {
    List<String> strings;
    Context context;

    public electiondetailAdapter(List<String> strings, Context context) {
        this.strings = strings;
        this.context = context;
    }

    @NonNull
    @Override
    public myview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.candidatenamee,parent,false);
        return new electiondetailAdapter.myview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myview holder, int position) {
        holder.name.setText(strings.get(position));
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    class myview extends RecyclerView.ViewHolder{
        TextView name,noofvotes;

        public myview(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            noofvotes=itemView.findViewById(R.id.numberofvotes);
        }
    }
}
