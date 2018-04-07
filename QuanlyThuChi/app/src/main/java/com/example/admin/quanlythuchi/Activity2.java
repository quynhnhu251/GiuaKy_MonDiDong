package com.example.admin.quanlythuchi;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView txtHinhThuc, txtNoiDung, txtSoTien, txtNgay, txtNote;
    EditText edtNoiDung, edtSoTien, edtNgay, edtNote;
    RadioGroup radioGroup;
    RadioButton radioThu, radioChi;
    Button btnLuu, btnHienThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        AnhXa();

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Luu();
            }
        });

        btnHienThi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    public void Luu(){

        //String noidung, ngay, sotien,  note;
        boolean hinhThuc = false; // thu

        if (radioChi.isChecked())
            hinhThuc = true;




        edtNote.getText().toString();


        Data_Money dbMoney = new Data_Money();

        dbMoney.setForm(hinhThuc);
        dbMoney.setAmount(edtSoTien.getText().toString());
        dbMoney.setContent( edtNoiDung.getText().toString());
        dbMoney.setDate(edtNgay.getText().toString());
        dbMoney.setNote(edtNote.getText().toString());

        //Log.d("info", hinhThuc + " " + ngay + " " + noidung + " " + sotien + " " + note);

        MainActivity.listDS.add(dbMoney);
        Toast.makeText(this, "Lưu thành công", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
    }

    public void AnhXa(){

        radioGroup = findViewById(R.id.radioGroup);
        radioThu = findViewById(R.id.radio_Thu);
        radioChi = findViewById(R.id.radio_Chi);
        edtNoiDung = findViewById(R.id.edtNoidung);
        edtSoTien = findViewById(R.id.edtSotien);
        edtNgay = findViewById(R.id.edtNgay);
        edtNote = findViewById(R.id.edtNote);
        btnLuu = findViewById(R.id.btnLuu);
        btnHienThi = findViewById(R.id.btnHienThi);

    }

}
