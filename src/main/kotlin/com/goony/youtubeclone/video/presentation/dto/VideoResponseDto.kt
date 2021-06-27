package com.goony.youtubeclone.video.presentation.dto

import com.goony.youtubeclone.video.domain.Video
import java.time.LocalDate
import java.time.LocalDateTime

data class VideoResponseDto(
    val id: Long,
    val title: String,
    val viewCount: Int,
    val contentUrl: String,
    val channelName: String,
    val thumbnailUrl: String,
    val uploadDate: LocalDateTime
) {
    companion object  {
        fun of(
            id: Long,
            title: String,
            viewCount: Int,
            contentUrl: String,
            channelName: String,
            thumbnailUrl: String,
            uploadDate: LocalDateTime
        ) = VideoResponseDto(id,title, viewCount, contentUrl, channelName, thumbnailUrl, uploadDate)

        fun entityToDto(video: Video) = VideoResponseDto(
            id = video.id!!,
            title =  video.title,
            viewCount = video.viewCount,
            contentUrl = video.contentUrl,
            channelName = video.channelName,
            thumbnailUrl = video.thumbnail,
            uploadDate = video.updateDateTime
        )

    }
}
