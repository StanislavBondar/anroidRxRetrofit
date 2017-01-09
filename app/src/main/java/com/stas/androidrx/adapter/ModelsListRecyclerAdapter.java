package com.stas.androidrx.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.stas.androidrx.R;
import com.stas.androidrx.model.Model;

import java.util.ArrayList;

/**
 * @author Stas
 * @since 09.01.17.
 */

public class ModelsListRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<Model> models;

    public ModelsListRecyclerAdapter(ArrayList<Model> models) {
        this.models = models;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_model, parent, false);
        return new ViewHolderHotel(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolderHotel holderHotel = (ViewHolderHotel) holder;
        Model model = models.get(position);

        holderHotel.title.setText(model.getTitle());
        holderHotel.text.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class ViewHolderHotel extends RecyclerView.ViewHolder {
        public TextView title, text;

        public ViewHolderHotel(View v) {
            super(v);
            title = (TextView) v.findViewById(R.id.title);
            text = (TextView) v.findViewById(R.id.text);
        }
    }
}
