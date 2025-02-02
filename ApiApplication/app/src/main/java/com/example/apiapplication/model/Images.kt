package com.example.apiapplication.model

import com.google.gson.annotations.SerializedName


data class Images (

  @SerializedName("id"         ) var id        : Int?    = null,
  @SerializedName("service_id" ) var serviceId : Int?    = null,
  @SerializedName("image"      ) var image     : String? = null

)