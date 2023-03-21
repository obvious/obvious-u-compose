package `in`.obvious.course.compose.library

data class Chat(
    val id: Int,
    val username: String,
    val avatar: Int,
    val message: String,
    val time: String,
    val isGroup: Boolean,
    val isWork: Boolean,
    val isPersonal: Boolean,
    val isActive: Boolean
)
