package com.aregyan.github.views.results
import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.aregyan.github.R
import com.aregyan.github.databinding.FragmentResultLayoutBinding
import com.aregyan.github.util.Constant.userName
import com.aregyan.github.util.Constant.valueCorrect
import com.aregyan.github.views.userDetails.UserDetailsFragmentDirections
import com.aregyan.github.views.userList.UserListFragmentDirections
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultFragment : Fragment() {

    private lateinit var binding: FragmentResultLayoutBinding
    private val viewModel: ResultViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pieChart()
        binding.tvUserName.text = userName
        binding.tvUserMarks.text = getString(R.string.user_score) +" " + valueCorrect.toString() +""+ " points"

        val callback = requireActivity().onBackPressedDispatcher.addCallback(this) {
            // Create a custom dialog box
            val builder = AlertDialog.Builder(requireContext())
            builder.setMessage("Are you sure you want to exit the app?")
            builder.setPositiveButton("Yes") { dialog, which ->
                // Call requireActivity().finish() to close the activity and exit the app
                requireActivity().finish()
            }
            builder.setNegativeButton("No") { dialog, which ->
                // Do nothing
            }
            builder.show()
        }










    binding.submitButtonT.setOnClickListener {
            val action = UserDetailsFragmentDirections.actionUserDetailsToResult()
            findNavController().navigate(action)
        }
    }





    private fun pieChart() {
        val i = 10 // Full marks
        val j = valueCorrect // Pass marks
        val passPercent = j.toFloat() / i * 100
        val failPercent = (i - j).toFloat() / i * 100

        val entries = listOf(
            PieEntry(passPercent, j),
            PieEntry(failPercent, i)
        )

        val dataSet = PieDataSet(entries, "Marks")
        dataSet.colors = listOf(Color.GREEN, Color.RED)
        dataSet.valueTextColor = Color.WHITE

        val data = PieData(dataSet)

        binding.chHallTgold.data = data
        binding.chHallTgold.setUsePercentValues(true)
        binding.chHallTgold.description.isEnabled = true
        binding.chHallTgold.legend.isEnabled = true
        binding.chHallTgold.setEntryLabelTextSize(16f)
        binding.chHallTgold.holeRadius = 50f
        binding.chHallTgold.transparentCircleRadius = 0f

        binding.chHallTgold.invalidate()
    }
}
