package com.goony.youtubeclone.video.domain.repository

import com.goony.youtubeclone.video.domain.Video
import org.springframework.data.jpa.repository.JpaRepository

interface VideoRepository : JpaRepository<Video, Long>{
}