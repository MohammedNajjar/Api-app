package com.example.apiapplication.model

import com.google.gson.annotations.SerializedName


data class Category (

  @SerializedName("id"    ) var id    : Int?    = null,
  @SerializedName("image" ) var image : String? = null,
  @SerializedName("title" ) var title : String? = null

)