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
        val videoList = listOf(
            Video(
                1,
                "hi",
                "hello",
                30,
                "https://goony.world.com",
                "goonyworld",
                "https://thumbnail.goonyworld.com",
                Video.Status.OPEN),
            Video(
                2,
                "hi",
                "hello",
                30,
                "https://goony.world.com",
                "goonyworld",
                "https://thumbnail.goonyworld.com",
                Video.Status.OPEN),
            Video(
                3,
                "hi",
                "hello",
                30,
                "https://goony.world.com",
                "goonyworld",
                "https://thumbnail.goonyworld.com",
                Video.Status.OPEN),
            Video(
                4,
                "hi",
                "hello",
                30,
                "https://goony.world.com",
                "goonyworld",
                "https://thumbnail.goonyworld.com",
                Video.Status.OPEN)
        )
        videoRepository.saveAll(videoList)
        videoRepository.flush()
        return videoRepository
            .findAll()
            .stream()
            .map {VideoResponseDto.entityToDto(it)}
            .toList()

    }
}
