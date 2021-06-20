package com.goony.youtubeclone.video.application

import com.goony.youtubeclone.video.presentation.dto.VideoResponseDto
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class VideoService {
    fun getList(): Flux<VideoResponseDto> {

        return Flux.just(VideoResponseDto.of())
    }

}
