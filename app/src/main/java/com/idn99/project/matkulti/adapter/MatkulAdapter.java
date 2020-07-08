package com.idn99.project.matkulti.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.idn99.project.matkulti.R;
import com.idn99.project.matkulti.activity.KeteranganMatkulActivity;
import com.idn99.project.matkulti.model.Matkul;

import java.util.ArrayList;

public class MatkulAdapter extends RecyclerView.Adapter<MatkulAdapter.MatkulViewHolder> {

    private ArrayList<Matkul> matkul;
    private Context ctx;

    public MatkulAdapter(ArrayList<Matkul> matkul, Context ctx) {
        this.matkul = matkul;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public MatkulViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.list_matkul_design,parent, false);
        return new MatkulViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MatkulViewHolder holder, final int position) {
        holder.tvMatkul.setText(matkul.get(position).getNamaMatkul());
        holder.tvSks.setText(matkul.get(position).getSks()+" SKS");
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return matkul.size();
    }

    public class MatkulViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout layoutMatkul;
        private TextView tvMatkul, tvSks;
        private int position;

        public MatkulViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutMatkul = itemView.findViewById(R.id.layout_matkul);
            tvMatkul = itemView.findViewById(R.id.tv_matkul);
            tvSks = itemView.findViewById(R.id.tv_sks);
            layoutMatkul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ctx, KeteranganMatkulActivity.class);
                    intent.putExtra("matkul", matkul.get(position));
                    ctx.startActivity(intent);
                }
            });
        }
    }
}
