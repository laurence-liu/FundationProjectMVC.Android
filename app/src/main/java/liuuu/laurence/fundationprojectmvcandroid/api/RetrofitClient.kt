package liuuu.laurence.fundationprojectmvcandroid.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient


class RetrofitClient {

    companion object {
        private const val GITHUB_BASE_URL = "https://api.github.com/"

        fun gitHubMethods(): GitHubMethods {
            val retrofit = Retrofit.Builder()
                    .baseUrl(RetrofitClient.GITHUB_BASE_URL)
                    .client(OkHttpClient().newBuilder().build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit.create(GitHubMethods::class.java)
        }
    }

}