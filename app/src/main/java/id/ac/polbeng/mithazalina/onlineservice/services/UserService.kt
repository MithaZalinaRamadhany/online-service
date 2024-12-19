package id.ac.polbeng.mithazalina.onlineservice.services

import id.ac.polbeng.mithazalina.onlineservice.models.LoginResponse
import retrofit2.Call
import retrofit2.http.*

interface UserService {
    @GET("login")
    fun loginUser(
        @QueryMap filter: HashMap<String, String>
    ) : Call<LoginResponse>
}