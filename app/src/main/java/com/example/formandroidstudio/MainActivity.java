package com.example.formandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_nama, et_now, et_alamat, et_password;
    String nama, now, alamat, password, kota;
    Spinner sp_kota;
    Button btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nama = findViewById(R.id.et_nama);
        et_now = findViewById(R.id.et_noWhatsapp);
        et_alamat = findViewById(R.id.et_alamat);
        et_password = findViewById(R.id.et_password);
        sp_kota = findViewById(R.id.sp_kota);
        btn_daftar = findViewById(R.id.btn_daftar);

        btn_daftar.setOnClickListener(v -> {
            nama = et_nama.getText().toString();
            now = et_now.getText().toString();
            alamat = et_alamat.getText().toString();
            password = et_password.getText().toString();
            kota = sp_kota.getSelectedItem().toString();

            if (nama.trim().equals("")) {
                et_nama.setError("Silahkan inputkan Nama");
            }
            if (now.trim().equals("")) {
                et_now.setError("Silahkan inputkan Nomor");
            }
            if (alamat.trim().equals("")) {
                et_alamat.setError("Silahkan inputkan Alamat");
            }
            if (password.trim().equals("")) {
                et_password.setError("Silahkan inputkan Password");
            }
            if (kota.trim().equals("Pilih Kota Asal")) {
                Toast.makeText(this, "Jangan lupa pilih Kota", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Berhasil Mendaftar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}