package umc.standard.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {
    @GET("/api/search.api?output=json")
    fun getBookbyName(
        @Query("key") apiKey:String, //요구하는 기본인자를 @Query형태로
        @Query("query") keyword: String

    ): Call<SearchBookDto> //반환하는 값SearchBookDto

    @GET("/api/bestSeller.api?output=json&categoryId=100")
    fun getBestSeller(
        @Query("key") apiKey:String

    ):Call<BestSellerDto>
}