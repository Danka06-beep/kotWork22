object PostData {
    fun getPostBase() = arrayListOf<Post>( Post(1,"Дан",1634582976283,"https://www.youtube.com/watch?v=4haurn3S8z8",
        like = false,
        comment = false,
        share = false,0,0,0,"Дементьева 12",
        coordinates = Pair(55.84058,38.20251),type = Types.YoutubeVideo,hidePost = false),

        Post (2,"Ил",1634583544357,"https://www.youtube.com/watch?v=vd205Q_EE18",
            like = false,
            comment = false,
            share = false,
            0,0,0,
            "Дементьева 12",coordinates = Pair(55.84058,38.20251),
            type = Types.YoutubeVideo,hidePost = false),

        Post (3,"Хайам",1634650874450,"https://sun1-30.userapi.com/impg/1MiP49SbCxyk8KHQ4svLR10yGIHbUO2ZDdaVCg/Ug4DJFiZ1r0.jpg?size=1280x853&quality=96&sign=a48427054c53e50b6f7deb128d8ccc40&type=album",
            like = false,
            comment = false,
            share = false,
            0,0,0,
            "Дементьева 12",coordinates = Pair(55.84058,38.20251),
            type = Types.SponsoredPosts,hidePost = false,url = "https://vk.com/marvel_dc"))

    fun getPostAdvertising() =  arrayListOf<Post>(Post(7,"Пятница",1634650874450,"https://sun1-99.userapi.com/impf/c844722/v844722724/1d8dcf/BkPdJtPQNn8.jpg?size=809x1080&quality=96&sign=184affb24657e9265b9bf5de75905751&type=album",
    like = false,
    comment = false,
    share = false,
    0,0,0,
        "Дементьева 12",coordinates = Pair(55.84058,38.20251),
        type = Types.SponsoredPosts,hidePost = false,url = "https://vk.com/marvel_dc"
    ),
    Post(8,"Дойл",1634650874450,"https://sun1-22.userapi.com/impf/c622827/v622827349/44cfb/RtkiymBF8PY.jpg?size=900x900&quality=96&sign=cb8cfff238701b08cccf56d79382f046&type=album",
    like = false,
    comment = false,
    share = false,
    0,0,0,"Дементьева 12",coordinates = Pair(55.84058,38.20251),
        type = Types.SponsoredPosts,hidePost = false,url = "https://vk.com/marvel_dc"))
}


