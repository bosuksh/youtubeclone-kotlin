package com.goony.youtubeclone.video.presentation.dto

data class VideoResponseDto(
    val id: Long,
    val title: String,
    val viewCount: Int,
    val contentUrl: String,
    val channelName: String,
    val thumbnailUrl: String,
    val uploadDate: String
) {
    companion object  {
        fun of(
            id: Long,
            title: String,
            viewCount: Int,
            contentUrl: String,
            channelName: String,
            thumbnailUrl: String,
            uploadDate: String
        ) = VideoResponseDto(id,title, viewCount, contentUrl, channelName, thumbnailUrl, uploadDate)
    }
}
