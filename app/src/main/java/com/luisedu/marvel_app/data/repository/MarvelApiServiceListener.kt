package com.luisedu.marvel_app.data.repository

import com.luisedu.marvel_app.model.Data
import com.luisedu.marvel_app.model.MarvelApiResponse

interface MarvelApiServiceListener {

    fun onSuccess(response: MarvelApiResponse)

    fun onSuccessComics(response: Data)

    fun onError(error: Throwable)
}