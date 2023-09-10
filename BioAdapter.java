package com.example.bio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BioAdapter extends RecyclerView.Adapter<BioAdapter.BioViewHolder> {

    private List<BioModel> bioList;

    public BioAdapter(List<BioModel> bioList) {
        this.bioList = bioList;
    }

    @NonNull
    @Override
    public BioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bio_list_item, parent, false);
        return new BioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BioViewHolder holder, int position) {
        BioModel bio = bioList.get(position);
        holder.textViewName.setText("Nome: " + bio.getNome());
        holder.textViewAge.setText("Idade: " + bio.getIdade());
        holder.textViewProfession.setText("Profissão: " + bio.getProfissao());
        holder.textViewSummary.setText("Resumo: " + bio.getResumo());
    }

    @Override
    public int getItemCount() {
        return bioList.size();
    }

    static class BioViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewAge;
        TextView textViewProfession;
        TextView textViewSummary;

        BioViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewAge = itemView.findViewById(R.id.textViewAge);
            textViewProfession = itemView.findViewById(R.id.textViewProfession);
            textViewSummary = itemView.findViewById(R.id.textViewSummary);
        }
    }
}