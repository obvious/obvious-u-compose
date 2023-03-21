package `in`.obvious.course.compose.library

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import `in`.obvious.course.compose.library.databinding.ItemChatBinding

class ChatAdapter : ListAdapter<Chat, RecyclerView.ViewHolder>(ChatItemDiff) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemChatBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ChatViewHolder).bind(getItem(position))
    }

    inner class ChatViewHolder(private val binding: ItemChatBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(chat: Chat) {
            with(binding) {
                name.text = chat.username
                thumbnail.setImageDrawable(ContextCompat.getDrawable(itemView.context, chat.avatar))
                message.text = chat.message
                time.text = chat.time
                if (!chat.isGroup) {
                    val onlineStatusDrawable = when {
                        chat.isActive && chat.isWork -> R.drawable.ic_online_indicator_work
                        chat.isActive && chat.isPersonal -> R.drawable.ic_online_indicator_active
                        else -> R.drawable.ic_online_indicator_inactive
                    }
                    onlineIndicator.setImageDrawable(
                        ContextCompat.getDrawable(
                            itemView.context,
                            onlineStatusDrawable
                        )
                    )
                }
            }
        }
    }
}


object ChatItemDiff : DiffUtil.ItemCallback<Chat>() {
    override fun areItemsTheSame(oldItem: Chat, newItem: Chat): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Chat, newItem: Chat): Boolean {
        return oldItem == newItem
    }


}