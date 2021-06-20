package com.goony.youtubeclone.video.application

import com.goony.youtubeclone.video.domain.repository.VideoRepository
import com.goony.youtubeclone.video.presentation.dto.VideoResponseDto
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toFlux

@Service
class VideoService(private val videoRepository: VideoRepository) {
    fun getList(): Mono<List<VideoResponseDto>> {
        videoRepository.findAll()
        return
    }
}
