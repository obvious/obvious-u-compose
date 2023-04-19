package `in`.obvious.course.compose.data.mapper

import `in`.obvious.course.compose.app.util.formatDate
import `in`.obvious.course.compose.data.dto.PictureDto
import `in`.obvious.course.compose.domain.model.Picture

fun PictureDto.toPicture(): Picture {
    return Picture(
        title = this.title ?: "",
        date = formatDate(this.date) ?: "",
        explanation = this.explanation ?: "",
        imageUrl = this.url ?: "",
        hdImageUrl = this.hdUrl ?: ""
    )
}