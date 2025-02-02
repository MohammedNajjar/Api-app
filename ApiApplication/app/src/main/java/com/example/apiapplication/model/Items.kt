package com.example.apiapplication.model

import com.google.gson.annotations.SerializedName


data class Items (

    @SerializedName("id"          ) var id         : Int?              = null,
    @SerializedName("customer_id" ) var customerId : Int?              = null,
    @SerializedName("title"       ) var title      : String?           = null,
    @SerializedName("details"     ) var details    : String?           = null,
    @SerializedName("cover_image" ) var coverImage : String?           = null,
    @SerializedName("longitude"   ) var longitude  : Double?           = null,
    @SerializedName("latitude"    ) var latitude   : Double?           = null,
    @SerializedName("mobile"      ) var mobile     : String?           = null,
    @SerializedName("category_id" ) var categoryId : Int?              = null,
    @SerializedName("city_id"     ) var cityId     : Int?              = null,
    @SerializedName("created_at"  ) var createdAt  : String?           = null,
    @SerializedName("customer"    ) var customer   : Customer?         = Customer(),
    @SerializedName("images"      ) var images     : ArrayList<Images> = arrayListOf(),
    @SerializedName("category"    ) var category   : Category?         = Category(),
    @SerializedName("city"        ) var city       : City?             = City(),
    @SerializedName("rates"       ) var rates      : ArrayList<Rates>  = arrayListOf()

)