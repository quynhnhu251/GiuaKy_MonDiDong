package com.example.admin.quanlythuchi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 4/5/2018.
 */

public class Adapter_Info extends BaseAdapter{

    Context context;
    int layout;
    ArrayList<Data_Money> listDS;

    public Adapter_Info(Context context, int layout, ArrayList<Data_Money> listDS) {
        this.context = context;
        this.layout = layout;
        this.listDS = listDS;
    }

    @Override
    public int getCount() {
        return listDS.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        ImageView imageView = view.findViewById(R.id.imgHinh);
        TextView txtNgay = view.findViewById(R.id.txt_ngay);
        TextView txtNoiDung = view.findViewById(R.id.txt_Noidung);
        TextView txtSoTien = view.findViewById(R.id.txt_Sotien);
        TextView txtNote = view.findViewById(R.id.txt_ghichu);


        //ImageButton imgBtnDel = view.findViewById(R.id.imgBtn_del);
        //ImageButton imgBtnEdit = view.findViewById(R.id.imgBTN_edit);

        Data_Money data_money = listDS.get(i);

        txtNgay.setText(data_money.getDate());
        txtNoiDung.setText(data_money.getContent());
        txtSoTien.setText(data_money.getAmount());
        txtNote.setText(data_money.getNote());


        if (data_money.isForm())
            imageView.setImageResource(R.drawable.chi_icon);
        else
            imageView.setImageResource(R.drawable.thu_icon);

        return view;
    }
}
