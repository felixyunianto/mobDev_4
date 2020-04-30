package felix.uts_group4_mobdev.uts.com.api

import felix.uts_group4_mobdev.uts.com.models.DefaultResponse
import felix.uts_group4_mobdev.uts.com.models.LoginResponse
import felix.uts_group4_mobdev.uts.com.models.ShopResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("name") name :String,
        @Field("email") email : String,
        @Field("password") password : String,
        @Field("c_password") C_password : String
    ): Call<DefaultResponse>

    @FormUrlEncoded
    @POST("login")
    fun userLogin(
        @Field("email") email:String,
        @Field("password") password: String
    ):Call<LoginResponse>

    @GET("shop")
    fun getShop(@Header("api_token") value: String): Call<ShopResponse>
}