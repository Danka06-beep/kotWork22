object PostData {
    fun getPostBase() = arrayListOf<Post>( Post(1,
        "lg",234,"lal alal",
        like = false, comment = false,
        share = false, 0,
        0, 0,
        "Деменьтева 12",
        Pair(23.434, 23.4324),
        type = Types.YoutubeVideo),

        Post (2, "Dan",234,"hello",
            like = false, comment = false,
            share = false, 0,
            0, 0,
            "Деменьтева 12",
            Pair(23.434, 23.4324),
            type = Types.Reposts),

        Post (3, "Il",234,"world",
            like = false, comment = false,
            share = false, 0,
            0, 0,
            "Деменьтева 12",
            Pair(23.434, 23.4324),
            type = Types.SponsoredPosts))


}