package com.quiz.app.views.quizScreen
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.aregyan.github.databinding.FragmentQuizScreenBinding
import com.quiz.app.util.Constant
import com.quiz.app.util.Constant.loadingValue
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber


@AndroidEntryPoint
class QuizScreenFragment : Fragment() {
    private lateinit var viewModel: QuizScreenViewModel
    private var _binding: FragmentQuizScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentQuizScreenBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(QuizScreenViewModel::class.java)
        val recyclerView = binding.recyclerView
        viewModel.getUserDetails()
        viewModelOperation(recyclerView)
        return binding.root
    }


    private fun startTimer() {
        val remainingTime: Long = 120000L
        binding.ivImage.visibility = View.VISIBLE
        binding.tvTimer.visibility = View.VISIBLE
        val timer = object : CountDownTimer(remainingTime, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // Update UI for countdown here
                binding.tvTimer.text = "${(millisUntilFinished / 1000)} sec"
            }

            override fun onFinish() {
                val action = QuizScreenFragmentDirections.actionQuizScreenToResult()
                 findNavController().navigate(action)
            }
        }
        timer.start()
    }



    private fun viewModelOperation(recyclerView: RecyclerView) {
        viewModel.questions.observe(viewLifecycleOwner) { questions ->

            if (viewModel.isFirstLoad) {
                viewModel.isFirstLoad = false
                startTimer()
            }

            val questionsList = viewModel.questions.value
            if (questionsList.isNullOrEmpty()) {
                recyclerView.visibility = View.GONE
                // Handle the case where there are no questions to display
            } else {
                loadingValue = true
                binding.progressBar.visibility = View.INVISIBLE

                val question = questionsList?.get(0)
                val answerOptions = listOf(
                    question?.answers?.answerA ?: "",
                    question?.answers?.answerB ?: "",
                    question?.answers?.answerC ?: "",
                    question?.answers?.answerD ?: "",
                    question?.answers?.answerE?.toString() ?: "",
                    question?.answers?.answerF?.toString() ?: "",
                )

                val adapter = question?.let {
                    QuizScreenAdapter(
                        it,
                        answerOptions,
                        object : QuizScreenAdapter.OnItemClickListener {
                            override fun onItemClick(answerOption: String) {
                                Timber.d("Clicked ${Constant.valueCorrect}")

                            }
                        },
                        object : QuizScreenAdapter.OnSubmitClickListener {
                            override fun onSubmitClick() {
                                viewModel.getUserDetails()
                                viewModelOperation(recyclerView)
                            }
                        }
                    )
                }

                recyclerView.adapter = adapter
                recyclerView.visibility = View.VISIBLE
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}








