package com.example.classapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.classapp.R;
import com.example.classapp.model.Note;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter {

    ArrayList<Note> notesList;
    Context context;

    LayoutInflater inflater;
    public NoteAdapter(Context context,ArrayList<Note> notesList) {
        this.notesList = notesList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listView = inflater.inflate(R.layout.list_item,parent,false);
        NoteViewHolder holder = new NoteViewHolder(listView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       NoteViewHolder noteViewHolder = (NoteViewHolder) holder;
        noteViewHolder.title.setText(notesList.get(position).getTitle());
        noteViewHolder.body.setText(notesList.get(position).getBody());

        if (!notesList.get(position).getImage().isEmpty()){
            noteViewHolder.image.setVisibility(View.VISIBLE);
            Picasso.get().load(notesList.get(position).getImage()).into(noteViewHolder.image);
        }
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }
}

class NoteViewHolder extends RecyclerView.ViewHolder{

    public TextView title;
    public TextView body;
    public ImageView image;
    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        this.title = (TextView) itemView.findViewById(R.id.list_note_title);
        this.body = (TextView) itemView.findViewById(R.id.list_note_body);
        this.image = (ImageView) itemView.findViewById(R.id.list_note_image);
    }
}