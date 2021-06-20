package com.goony.youtubeclone.video.presentation.model

import reactor.core.publisher.Flux

data class Response<T>(val data: T) {
    companion object{
        fun <T> nullable(data: T?): Response<T?> = Response(data)
        fun <T> empty() : Response<T?> = Response(null)
    }
}

data class TotalElementResponse<T>(val data: Flux<T>, val totalCount: Long) {
    companion object {
        fun<T> of(data:Flux<T>, totalCount: Long) =  TotalElementResponse(data, totalCount)
    }
}