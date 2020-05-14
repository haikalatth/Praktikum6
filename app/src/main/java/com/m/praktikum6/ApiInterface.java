package com.m.praktikum6;

import com.m.praktikum6.GetMahasiswa;
import com.m.praktikum6.PostPutDelMahasiswa;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("read.php")
    Call<GetMahasiswa> getMahasiswa();
    @FormUrlEncoded
    @POST("insert.php")
    Call<PostPutDelMahasiswa> daftar(@Field("nama") String nama,
                                            @Field("jurusan") String jurusan,
                                            @Field("email") String email);
    @FormUrlEncoded
    @POST("update.php")
    Call<PostPutDelMahasiswa> update(@Field("id") String id,
                                           @Field("nama") String nama,
                                           @Field("jurusan") String jurusan,
                                           @Field("email") String email);
    @FormUrlEncoded
    @POST("delete.php")
    Call<PostPutDelMahasiswa> delete(@Field("id") String id);

}
