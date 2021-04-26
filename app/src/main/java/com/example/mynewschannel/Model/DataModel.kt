package com.example.mynewschannel.Model

import javax.xml.transform.Source

import com.google.gson.annotations.SerializedName

data class DataModel(

        @SerializedName("author")
        val author: String,

        @SerializedName("title")
        val title : String,

        @SerializedName("description")
        val description: String,

        @SerializedName("url")
        val url: String,

        @SerializedName("Source")
        val Source: Source,

        @SerializedName("image")
        val image: String,

        @SerializedName("category")
        val  category: CharCategory,
        @SerializedName("language")
        val language: String,

        @SerializedName("country")
        val country:String,

        @SerializedName("publishedAt")
        val publishedAt:String

)
