package `in`.obvious.course.compose.data.repository

import android.app.Application
import `in`.obvious.course.compose.app.util.parseListFromAssets
import `in`.obvious.course.compose.data.dto.PictureDto
import `in`.obvious.course.compose.data.mapper.toPicture
import `in`.obvious.course.compose.domain.model.Picture
import `in`.obvious.course.compose.domain.repository.PictureRepository
import javax.inject.Inject

class PictureRepositoryImpl @Inject constructor(private val application: Application) :
    PictureRepository {

    override fun getPictures(): List<Picture> {
        val spaceFactDtoList = parseListFromAssets<PictureDto>(
            context = application,
            filename = JSON_FILE_NAME
        )
        return spaceFactDtoList.map { it.toPicture() }
    }

    companion object {
        const val JSON_FILE_NAME = "data.json"
    }
}