package com.m.praktikum6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.m.praktikum6.PostPutDelMahasiswa;
import com.m.praktikum6.ApiClient;
import com.m.praktikum6.ApiInterface;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText nama,jurusan,email;
    private Button btnlist;
    private Button btnadd;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText) findViewById(R.id.nama);
        jurusan = (EditText) findViewById(R.id.jurusan);
        email = (EditText) findViewById(R.id.email);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<PostPutDelMahasiswa> postMahasiswaCall = mApiInterface.daftar(nama.getText().toString(), jurusan.getText().toString(), email.getText().toString());
                postMahasiswaCall.enqueue(new Callback<PostPutDelMahasiswa>() {
                    @Override
                    public void onResponse(Call<PostPutDelMahasiswa> call, Response<PostPutDelMahasiswa> response) {

                    }

                    @Override
                    public void onFailure(Call<PostPutDelMahasiswa> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btnlist = (Button) findViewById(R.id.btnlist);
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
