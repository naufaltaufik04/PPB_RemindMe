package com.example.remindme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ContentViewHolder> {

    private ArrayList<Content> listContent;

    public ContentAdapter(ArrayList<Content> listContent){
        this.listContent = listContent;
    }

    @NonNull
    @Override
    public ContentAdapter.ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_task, parent, false);

        return new ContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentAdapter.ContentViewHolder holder, int position) {
        holder.month.setText(listContent.get(position).getDueDate().toString().substring(4,7));
        holder.day.setText(String.valueOf(listContent.get(position).getDueDate().getDate()));
        //        System.out.println("d: " + (listContent.get(0).getDueDate().getYear()+1900));
        holder.title.setText(listContent.get(position).getTitle());
        holder.difficulty.setText("Tingkat: " + listContent.get(position).getDificulty());

        System.out.println(listContent.get(0).getTitle());
        holder.timeRemaining.setText("Tersisa " +
                String.valueOf(TimeUnit.DAYS.convert(
                        Long.valueOf(listContent.get(position).getDueDate().getTime()) - (listContent.get(position).getToday().getTime()),
                        TimeUnit.MILLISECONDS)) + " hari lagi"
        );
    }


    @Override
    public int getItemCount() {
        return (listContent != null) ? listContent.size() : 0;
    }

    public class ContentViewHolder extends RecyclerView.ViewHolder{
        private TextView month, day, title, difficulty, timeRemaining;

        public ContentViewHolder(View view){
            super(view);

            month = view.findViewById(R.id.monthTextView);
            day = view.findViewById(R.id.dayTextView);
            title = view.findViewById(R.id.titleTextView);
            difficulty = view.findViewById(R.id.difficultyTextView);
            timeRemaining = view.findViewById(R.id.timeRemainingTextView);
        }
    }
}
