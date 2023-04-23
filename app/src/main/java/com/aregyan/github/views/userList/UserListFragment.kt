package com.aregyan.github.views.userList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.aregyan.github.databinding.FragmentUserListBinding
import com.aregyan.github.util.Constant.userName
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserListFragment : Fragment() {
    private  lateinit var viewModel: UserListViewModel

    private var _binding: FragmentUserListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentUserListBinding.inflate(inflater, container, false)
       viewModel = ViewModelProvider(this).get(UserListViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.submitButton.setOnClickListener {
            userName = binding.editText.text.toString()
            viewModel.username = userName

            if (userName.isEmpty()) {
                Toast.makeText(requireContext(), "Please enter your username", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.username = userName
                val action = UserListFragmentDirections.actionUsersListToUserDetails(viewModel.username!!)
                findNavController().navigate(action)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
