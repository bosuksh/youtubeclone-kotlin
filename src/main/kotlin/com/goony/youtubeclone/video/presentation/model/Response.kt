package com.goony.youtubeclone.video.presentation.model

data class Response<T>(val data: T) {
    companion object{
        fun <T> nullable(data: T?): Response<T?> = Response(data)
        fun <T> empty() : Response<T?> = Response(null)
    }
}

data class TotalElementResponse<T>(val data: List<T>, val totalCount: Long) {
    companion object {
        fun<T> of(data: List<T>, totalCount: Int) =  TotalElementResponse(data, totalCount)
    }
}