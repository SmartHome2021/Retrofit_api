package com.example.fulljson.models

data class Film(
        val id: String,
        val rank: Int,
        val title: String,
        val fullTitle: String,
        val year: Int,
        val image: String,
        val crew: String,
        val imDbRating: Float,
        val imDbRatingCount: Long
    )

//data class Film(
//        var name: String? = null,
//        var realname: String? = null,
//        var team: String? = null,
//        var firstapperance: String? = null,
//        var createdby: String? = null,
//        var publisher: String? = null,
//        var imageurl: String? = null,
//        var bio: String? = null
//)