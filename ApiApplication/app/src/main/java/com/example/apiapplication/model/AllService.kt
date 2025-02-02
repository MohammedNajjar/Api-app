package com.example.apiapplication.model

import com.google.gson.annotations.SerializedName


data class AllService (

  @SerializedName("status"  ) var status  : Boolean?         = null,
  @SerializedName("code"    ) var code    : Int?             = null,
  @SerializedName("message" ) var message : String?          = null,
  @SerializedName("items"   ) var items   : ArrayList<Items> = arrayListOf()

)