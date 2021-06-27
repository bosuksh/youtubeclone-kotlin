package com.goony.youtubeclone.video.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
class Video(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,

    var title: String = "",

    var description: String = "",

    var viewCount: Int = 0,

    var contentUrl: String = "",

    var channelName: String = "",

    var thumbnail: String  = "",

    var status: Status = Status.OPEN

) {
    @CreatedDate
    var createDateTime: LocalDateTime? = null

    @LastModifiedDate
    var updateDateTime: LocalDateTime? = null

    enum class Status(val value: String) {
        OPEN("0"),

        CLOSED("1"),

        DELETED("2");

        companion object
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Video

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Video(id=$id, title='$title', viewCount=$viewCount, contentUrl='$contentUrl', channelName='$channelName', thumbnail='$thumbnail', status=$status, createDateTime=$createDateTime, updateDateTime=$updateDateTime)"
    }
}