package com.goony.youtubeclone.video.presentation.model

import reactor.core.publisher.Mono

data class Response<T>(val data: T) {
    companion object{
        fun <T> nullable(data: T?): Response<T?> = Response(data)
        fun <T> empty() : Response<T?> = Response(null)
    }
}

data class TotalElementResponse<T>(val data: Mono<List<T>>, val totalCount: Long) {
    companion object {
        fun<T> of(data:Mono<List<T>>, totalCount: Long) =  TotalElementResponse(data, totalCount)
    }
}