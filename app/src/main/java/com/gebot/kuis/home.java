package com.gebot.kuis;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.HashMap;

public class home extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextKode;
    private EditText editTextNama;
    private EditText editTextAkreditasi;

    private Button buttonAdd;
    private Button buttonView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        editTextKode = (EditText) findViewById(R.id.editTextKode);
        editTextNama = (EditText) findViewById(R.id.editTextNama);
        editTextAkreditasi = (EditText) findViewById(R.id.editTextAkreditasi);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonView = (Button) findViewById(R.id.buttonView);

        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);
    }

    private void addEmployee(){
        final String kode = editTextKode.getText().toString().trim();
        final String nama = editTextNama.getText().toString().trim();
        final String akreditasi = editTextAkreditasi.getText().toString().trim();


        class AddEmployee extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute(){
                super.onPreExecute();
                loading = ProgressDialog.show(home.this,"Menambahkan...","Tunggu..",false,false);
            }
            @Override
            protected void onPostExecute(String s){
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(home.this,s,Toast.LENGTH_LONG.show);
            }
            @Override
            protected String doInBackground(Void... v){
                HashMap<String,String> params = new HashMap<>();
                params.put(konfigurasi.KEY_EMP_KODE,kode);
                params.put(konfigurasi.KEY_EMP_NAMA,nama);
                params.put(konfigurasi.KEY_EMP_AKREDITASI,akreditasi);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }
        }
        AddEmployee ae = new AddEmployee();
        ae.execute();
    }
    @Override
    public void onClick(View v){
        if (v == buttonAdd){
            addEmployee();
        }
        if (v == buttonView){
            startActivity(new Intent(this,TampilSemua.class));
        }
    }
}
