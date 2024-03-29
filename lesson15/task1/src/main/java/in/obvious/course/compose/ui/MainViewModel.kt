package `in`.obvious.course.compose.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import `in`.obvious.course.compose.domain.model.Picture
import `in`.obvious.course.compose.domain.usecase.GetSortedPictures
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    getSortedPictures: GetSortedPictures
) : ViewModel() {

    private var _uiState = mutableStateOf(MainUiState.DEFAULT)
    val uiState get() = _uiState


    init {
        _uiState.value = _uiState.value.copy(pictures = getSortedPictures())
    }

    fun updateSelectedIndex(index: Int) {
        _uiState.value = _uiState.value.copy(selectedIndex = index)
    }

}

data class MainUiState(
    val pictures: List<Picture>,
    val selectedIndex: Int
) {
    companion object {
        val DEFAULT = MainUiState(
            pictures = emptyList(),
            selectedIndex = 0
        )
    }
}