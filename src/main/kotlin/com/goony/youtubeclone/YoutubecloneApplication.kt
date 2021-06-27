package com.goony.youtubeclone

import com.goony.youtubeclone.video.domain.repository.VideoRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YoutubecloneApplication(
    private val videoRepository: VideoRepository
)

fun main(args: Array<String>) {
    runApplication<YoutubecloneApplication>(*args)
}
