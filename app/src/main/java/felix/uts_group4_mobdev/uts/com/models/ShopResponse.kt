package felix.uts_group4_mobdev.uts.com.models

import com.google.gson.annotations.SerializedName

data class ShopResponse(
    @SerializedName("message") val message : String,
    @SerializedName("status") val status : Boolean,
    @SerializedName("data") val data : Shop?
)