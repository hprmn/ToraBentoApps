package edu.edo.torabentoapps.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.edo.torabentoapps.Model.transaksiModel;
import edu.edo.torabentoapps.R;

/**
 * Created by anggy on 20/08/2017.
 */

public class transaksiItemAdapter extends RecyclerView.Adapter<transaksiItemAdapter.holderTransaksi> {

    List<transaksiModel> data;

    public transaksiItemAdapter() {
        super();
        data = new ArrayList<transaksiModel>();
        transaksiModel item = new transaksiModel();
        item.setTransaksiID("#ID91283123");
        item.setNamamakanan("Shrimp roll");
        item.setTanggal_transaksi("2017-08-12");
        item.setStatuspemesanan("Diterima");
        item.setAlamat("Jln. pasir putih");
        item.setQuantity(3);
        item.setThumbnails(R.drawable.shrimproll);
        item.setTotalharga(320000);
        data.add(item);
    }

    @Override
    public holderTransaksi onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemtransaksi, parent, false);

        holderTransaksi yeah = new holderTransaksi(v);

        return yeah;
    }

    @Override
    public void onBindViewHolder(holderTransaksi holder, int position) {

        transaksiModel item = data.get(position);
        holder.transaksiID.setText(item.getTransaksiID());
        holder.namamakanan.setText(item.getNamamakanan());
        holder.quantityItem.setText(""+item.getQuantity());
        holder.thumbnailsItem.setImageResource(item.getThumbnails());
        holder.totalharga.setText("Rp. "+item.getTotalharga());
        holder.alamatkirim.setText(item.getAlamat());
        holder.status.setText(item.getStatuspemesanan());
        holder.timestamp.setText(item.getTanggal_transaksi());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class holderTransaksi extends RecyclerView.ViewHolder{
        public TextView transaksiID,namamakanan,quantityItem,timestamp,status,totalharga,alamatkirim;
        public ImageView thumbnailsItem;
        public CardView cardViewTransaksi;

        public holderTransaksi(View itemView) {
            super(itemView);
            transaksiID = (TextView)itemView.findViewById(R.id.transaksiID);
            namamakanan = (TextView)itemView.findViewById(R.id.namamakanan);
            quantityItem = (TextView)itemView.findViewById(R.id.quantityitem);
            timestamp = (TextView)itemView.findViewById(R.id.timestamp);
            status = (TextView)itemView.findViewById(R.id.statuspemesanan);
            totalharga = (TextView)itemView.findViewById(R.id.totalharga);
            alamatkirim = (TextView)itemView.findViewById(R.id.alamatkirim);
            thumbnailsItem = (ImageView)itemView.findViewById(R.id.thumbnailsitem);
            cardViewTransaksi = (CardView)itemView.findViewById(R.id.cardViewitemtransaksi);
        }
    }

}
