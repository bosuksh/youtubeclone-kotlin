package com.goony.youtubeclone.video.application

import com.goony.youtubeclone.video.domain.Video
import com.goony.youtubeclone.video.domain.repository.VideoRepository
import com.goony.youtubeclone.video.presentation.dto.VideoResponseDto
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers
import reactor.kotlin.core.publisher.toFlux
import kotlin.streams.toList

@Service
class VideoService(private val videoRepository: VideoRepository) {
    fun getList(): List<VideoResponseDto> {
        return videoRepository
            .findAll()
            .stream()
            .map {VideoResponseDto.entityToDto(it)}
            .toList()

    }
}
