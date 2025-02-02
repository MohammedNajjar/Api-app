package com.example.apiapplication.model

import com.google.gson.annotations.SerializedName


data class Customer (

  @SerializedName("id"            ) var id           : Int?    = null,
  @SerializedName("username"      ) var username     : String? = null,
  @SerializedName("note"          ) var note         : String? = null,
  @SerializedName("twitter"       ) var twitter      : String? = null,
  @SerializedName("instagram"     ) var instagram    : String? = null,
  @SerializedName("email"         ) var email        : String? = null,
  @SerializedName("mobile"        ) var mobile       : String? = null,
  @SerializedName("profile_image" ) var profileImage : String? = null,
  @SerializedName("notification"  ) var notification : Int?    = null

)