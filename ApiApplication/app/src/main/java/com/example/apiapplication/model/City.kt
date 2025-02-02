package com.example.apiapplication.model

import com.google.gson.annotations.SerializedName


data class City (

  @SerializedName("id"    ) var id    : Int?    = null,
  @SerializedName("title" ) var title : String? = null

)