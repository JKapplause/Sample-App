package com.info.cryptocrazyapp.repository

import com.info.cryptocrazyapp.model.Crypto
import com.info.cryptocrazyapp.model.CryptoList
import com.info.cryptocrazyapp.service.CryptoAPI
import com.info.cryptocrazyapp.util.Constants.API_KEY
import com.info.cryptocrazyapp.util.Constants.CALL_ATTRIBUTES
import com.info.cryptocrazyapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject


@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api : CryptoAPI
) {
    suspend fun getCryptoList() : Resource<CryptoList> {
        val response = try {
            api.getCryptoList(API_KEY)
        }catch (e : Exception) {
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id :String) : Resource<Crypto> {
        val response = try {
            api.getCrypto(API_KEY, id, CALL_ATTRIBUTES)
        }catch (e : Exception) {
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }
}