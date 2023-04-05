package umc.standard.retrofit

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("itemId") val id:Long,
    @SerializedName("title")val title:String,
    @SerializedName("description")val description:String,
    @SerializedName("coverSmallUrl")val coverSmallUrl:String
)
data class BestSellerDto (
    @SerializedName("title") val title:String,
    @SerializedName("item") val books:List<Book>
)
data class SearchBookDto (
    @SerializedName("title") val title:String,
    @SerializedName("item") val books:List<Book>
)