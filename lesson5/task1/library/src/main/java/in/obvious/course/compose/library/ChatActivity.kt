package `in`.obvious.course.compose.library

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import `in`.obvious.course.compose.library.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding
    private val chatAdapter by lazy { ChatAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpChatRecyclerView()
        setUpChatFilter()
    }

    private fun setUpChatRecyclerView() {
        binding.recyclerView.adapter = chatAdapter
        chatAdapter.submitList(chatList)
    }

    private fun setUpChatFilter() {
        binding.chatSelectionChipGroup.setOnCheckedStateChangeListener { group, checkedIds ->
           val filteredChat = when (checkedIds[0]) {
                R.id.allChat -> chatList
                R.id.work -> chatList.filter { it.isWork }
                R.id.personal -> chatList.filter { it.isPersonal }
                R.id.groups -> chatList.filter { it.isGroup }
                else -> chatList
            }
            chatAdapter.submitList(filteredChat)
        }
    }
}