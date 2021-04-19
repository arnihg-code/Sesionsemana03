package com.example.sesionsemana03.api;

import com.example.sesionsemana03.entity.User;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {

// jsonplaceholder.typicode.com/users



    @GET("users")

    public abstract Call<List<User>> listaUsuario();





}
