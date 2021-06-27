package com.goony.youtubeclone.video.domain.repository

import com.goony.youtubeclone.video.domain.Video
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VideoRepository : JpaRepository<Video, Long>{
}