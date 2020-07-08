package com.idn99.project.matkulti.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.idn99.project.matkulti.R;
import com.idn99.project.matkulti.activity.MatkulActivity;
import com.idn99.project.matkulti.model.Data;

import java.util.ArrayList;

public class SemesterAdapter extends RecyclerView.Adapter<SemesterAdapter.SemesterViewHolder> {

    private ArrayList<Data> semester = new ArrayList<>();
    private Context ctx;

    public SemesterAdapter(ArrayList<Data> semester, Context ctx) {
        this.semester = semester;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public SemesterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.list_semester_design,parent, false);
        return new SemesterViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull final SemesterViewHolder holder, final int position) {
        holder.tvSemester.setText(semester.get(position).getSemester());
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return semester.size();
    }

    public class SemesterViewHolder extends RecyclerView.ViewHolder {

        private TextView tvSemester;
        private int position;
        public SemesterViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSemester = itemView.findViewById(R.id.tv_semester);
            tvSemester.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ctx, MatkulActivity.class);
                    intent.putExtra("matkul", semester.get(position));
                    ctx.startActivity(intent);
                }
            });
        }
    }
}
