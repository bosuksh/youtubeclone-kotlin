package com.goony.youtubeclone.video.application

import com.goony.youtubeclone.video.domain.Video
import com.goony.youtubeclone.video.domain.repository.VideoRepository
import com.goony.youtubeclone.video.presentation.dto.VideoResponseDto
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import reactor.kotlin.test.test

@ExtendWith(MockitoExtension::class)
internal class VideoServiceTest {

    @Mock
    lateinit var videoRepository: VideoRepository

    @InjectMocks
    lateinit var videoService: VideoService


    @Test
    fun `비디오 리스트 조회`() {
        given(videoRepository.findAll()).willReturn(listOf())

        videoService.getList()
            .test()
            .expectNext(listOf())
            .verifyComplete()
    }

    @Test
    fun `비디오 리스트 동기 조회`() {
        given(videoRepository.findAll()).willReturn(listOf())

        videoService.getListSync()
            .test()
            .expectNext(listOf())
            .verifyComplete()
    }
}