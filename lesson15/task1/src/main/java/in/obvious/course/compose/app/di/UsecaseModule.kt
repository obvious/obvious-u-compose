package `in`.obvious.course.compose.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import `in`.obvious.course.compose.domain.repository.PictureRepository
import `in`.obvious.course.compose.domain.usecase.GetSortedPictures

@Module
@InstallIn(ViewModelComponent::class)
class UsecaseModule {

    @Provides
    fun provideGetSortedFactsUseCase(pictureRepository: PictureRepository) =
        GetSortedPictures(pictureRepository)

}