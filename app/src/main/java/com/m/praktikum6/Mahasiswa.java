package com.m.praktikum6;

import com.google.gson.annotations.SerializedName;
public class Mahasiswa {
    @SerializedName("id")
    private String id;
    @SerializedName("nama")
    private String nama;
    @SerializedName("jurusan")
    private String jurusan;
    @SerializedName("email")
    private String email;
    public Mahasiswa(){}
    public Mahasiswa(String id,String nama,String jurusan,String email){
        this.id = id;
        this.nama = nama;
        this.jurusan = jurusan;
        this.email = email;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
