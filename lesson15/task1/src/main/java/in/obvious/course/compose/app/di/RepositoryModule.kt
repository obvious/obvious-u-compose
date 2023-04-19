package `in`.obvious.course.compose.app.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import `in`.obvious.course.compose.domain.repository.PictureRepository
import `in`.obvious.course.compose.data.repository.PictureRepositoryImpl

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindPictureRepository(pictureRepositoryImpl: PictureRepositoryImpl): PictureRepository
}