package com.example.mynewschannel.Model

import com.google.gson.annotations.SerializedName

data class ResponseDataModel (
        @SerializedName("data")
        val data:ArrayList<DataModel>
)
