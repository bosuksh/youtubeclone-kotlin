package com.goony.youtubeclone.video.presentation

import com.goony.youtubeclone.video.application.VideoService
import com.goony.youtubeclone.video.presentation.dto.VideoResponseDto
import com.goony.youtubeclone.video.presentation.model.Response
import com.goony.youtubeclone.video.presentation.model.TotalElementResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toFlux

@RestController
@RequestMapping(produces = ["application/json;charset=UTF-8"])
class VideoResource(
    private val videoService: VideoService
){

    @GetMapping("/api/videos")
    fun getVideoList() : Mono<Response<Flux<VideoResponseDto>>> {
        val videoList = videoService.getList()
        return
    }
}