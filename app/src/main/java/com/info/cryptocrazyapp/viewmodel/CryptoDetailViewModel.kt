package com.info.cryptocrazyapp.viewmodel

import androidx.lifecycle.ViewModel
import com.info.cryptocrazyapp.model.Crypto
import com.info.cryptocrazyapp.repository.CryptoRepository
import com.info.cryptocrazyapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel() {

    suspend fun getCrypto(id: String): Resource<Crypto> {
        return repository.getCrypto(id)
    }
}