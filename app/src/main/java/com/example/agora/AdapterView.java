package com.example.agora;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class AdapterView extends RecyclerView.Adapter<AdapterView.Myview> {
    List<String> strings;
    Context context;
    int colors[][]=new int[5][2];

    public AdapterView(List<String> strings, Context context) {
        this.strings = strings;
        this.context = context;
        colors[0][0]=R.color.lightBlue;
        colors[0][1]=R.color.blue;
        colors[1][0]=R.color.yellow;
        colors[1][1]=R.color.lightYellow;
        colors[2][0]=R.color.lightGreen;
        colors[2][1]=R.color.green;
        colors[3][0]=R.color.lightPurple;
        colors[3][1]=R.color.purple;
        colors[4][0]=R.color.lightRed;
        colors[4][1]=R.color.red;
    }

    @NonNull
    @Override
    public Myview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.election_list_item,parent,false);
        return new AdapterView.Myview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myview holder, int position) {
        String string=strings.get(position);
        holder.electionName.setText(string);
        Random random=new Random();
        int i=random.nextInt(5);
        Log.i("color",i+" ");
        holder.button.setBackgroundColor(context.getResources().getColor(R.color.blue));
        holder.mainlayout.setBackgroundColor(context.getResources().getColor(R.color.lightBlue));
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    class Myview extends RecyclerView.ViewHolder {
        TextView electionName;
        ConstraintLayout mainlayout;
        Button button;
        public Myview(@NonNull View itemView) {
            super(itemView);
            button=itemView.findViewById(R.id.button);
            mainlayout=itemView.findViewById(R.id.mainlayout);
            electionName=itemView.findViewById(R.id.electionname);
        }
    }
}
