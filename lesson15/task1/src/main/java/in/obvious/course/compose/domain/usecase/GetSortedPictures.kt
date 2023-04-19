package `in`.obvious.course.compose.domain.usecase

import `in`.obvious.course.compose.domain.model.Picture
import `in`.obvious.course.compose.domain.repository.PictureRepository

class GetSortedPictures(private val pictureRepository: PictureRepository) {
    operator fun invoke(): List<Picture> {
        val spaceFacts = pictureRepository.getPictures()
        return spaceFacts.sortedByDescending { it.date }
    }
}