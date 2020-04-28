package Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bluesapp.R;

import java.util.ArrayList;

import Modelos.UsuarioChat;

public class AdaptadorCardChats extends RecyclerView.Adapter<AdaptadorCardChats.VistaHolder> {

    private ArrayList<UsuarioChat> listaChats;

    public AdaptadorCardChats(ArrayList<UsuarioChat> listaChats) {
        this.listaChats = listaChats;
    }

    @NonNull
    @Override
    public VistaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_chat, parent, false);
        VistaHolder holder = new VistaHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull VistaHolder holder, int position) {
        holder .nombre.setText(listaChats.get(position).getNombre());
        holder.lastMessage.setText(listaChats.get(position).getLastMessage());
    }

    @Override
    public int getItemCount() {
        if (listaChats.size() != 0) {
            return listaChats.size();
        } else {
            return 0;
        }
    }

    public static class VistaHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView lastMessage;
        ImageView foto;

        public VistaHolder(@NonNull View v) {
            super(v);

            nombre = v.findViewById(R.id.txt_nombre);
            lastMessage = v.findViewById(R.id.txt_lastMessage);

        }
    }
}
