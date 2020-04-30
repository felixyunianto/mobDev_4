package felix.uts_group4_mobdev.uts.com.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String,
    @SerializedName("email") val email : String,
    @SerializedName("api_token") val api_token : String
)
