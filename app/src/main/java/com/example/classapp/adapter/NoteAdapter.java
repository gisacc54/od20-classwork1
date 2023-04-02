package com.example.classapp.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.classapp.R;
import com.example.classapp.model.Note;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NoteAdapter extends BaseAdapter {

    Context context;
    LayoutInflater notesLayout;
    ArrayList<Note> notesList;

    public NoteAdapter(Context context,ArrayList<Note> notesList){
        this.context = context;
        this.notesList = notesList;
        this.notesLayout = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return notesList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View noteRow = notesLayout.inflate(R.layout.list_item,null);

        TextView title = (TextView) noteRow.findViewById(R.id.list_note_title);
        TextView body = (TextView) noteRow.findViewById(R.id.list_note_body);
        ImageView image = (ImageView) noteRow.findViewById(R.id.list_note_image);

        title.setText(notesList.get(position).getTitle());
        body.setText(notesList.get(position).getBody());

        if (!notesList.get(position).getImage().isEmpty()){
            image.setVisibility(View.VISIBLE);
            Picasso.get().load(notesList.get(position).getImage()).into(image);
        }
         return noteRow;
    }
}
