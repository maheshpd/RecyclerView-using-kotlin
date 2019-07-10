package com.example.simplerecyclerviewinkotlin

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val id: Int,

    @SerializedName("image")
    val image: String,

    @SerializedName("rating")
    val rating: String,

    @SerializedName("like_percent")
    val likePercent: Int,

    @SerializedName("vote_count")
    val voteCount: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("language")
    val language: String,

    @SerializedName("type")
    val type: String,

    @SerializedName("is_new")
    val isNew: Int
)