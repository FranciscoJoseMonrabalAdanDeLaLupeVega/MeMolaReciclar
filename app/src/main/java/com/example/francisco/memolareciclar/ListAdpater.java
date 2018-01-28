package com.example.francisco.memolareciclar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdpater extends RecyclerView.Adapter<ListAdpater.MyViewHolder> {

    private ArrayList<Frase> frasesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView frase;
        public ImageView pic;
        public Button boton;
        public TextView contador;

        public MyViewHolder(View view) {
            super(view);
            boton = (Button) view.findViewById(R.id.btnRecicler);
            pic = (ImageView) view.findViewById(R.id.picRecycler);
            frase = (TextView) view.findViewById(R.id.fraseRecicler);
            contador = (TextView) view.findViewById(R.id.tCounter);
        }
    }


    public ListAdpater(ArrayList<Frase> frasesList) {
        this.frasesList = frasesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recicler_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        final Frase frase = frasesList.get(position);
        holder.frase.setText(frase.getFrase());
        holder.contador.setText("" + frase.getCounter());
        holder.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frase.incrementCounter();
                holder.contador.setText("" + frase.getCounter());
                Toast.makeText(v.getContext(), frase.getFrase(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return frasesList.size();
    }
}