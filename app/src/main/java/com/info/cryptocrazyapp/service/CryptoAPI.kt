package com.info.cryptocrazyapp.service

import com.info.cryptocrazyapp.model.Crypto
import com.info.cryptocrazyapp.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.jar.Attributes

interface CryptoAPI {

    @GET("prices")
    suspend fun getCryptoList(
        @Query("key") key : String
    ) :CryptoList

    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key : String,
        @Query("ids") ids : String,
        @Query("attributes") attributes: String
    ) : Crypto
}