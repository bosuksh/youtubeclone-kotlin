package com.goony.youtubeclone.video.presentation

import com.goony.youtubeclone.video.application.VideoService
import com.goony.youtubeclone.video.presentation.dto.VideoResponseDto
import com.goony.youtubeclone.video.presentation.model.TotalElementResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(produces = ["application/json;charset=UTF-8"])
class VideoResource(
    private val videoService: VideoService
){

    @GetMapping("/api/videos")
    fun getVideoList() : TotalElementResponse<VideoResponseDto>{
        val videoList = videoService.getList()
        return TotalElementResponse.of(videoList, videoList.size)
    }
}