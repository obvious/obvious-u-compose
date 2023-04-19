package `in`.obvious.course.compose.domain.repository

import `in`.obvious.course.compose.domain.model.Picture

interface PictureRepository {
    fun getPictures(): List<Picture>
}