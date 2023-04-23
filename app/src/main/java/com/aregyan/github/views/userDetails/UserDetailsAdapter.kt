package com.aregyan.github.views.userDetails
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aregyan.github.R
import com.aregyan.github.model.Question
import com.aregyan.github.util.Constant.valueCorrect


class UserDetailsAdapter(
    private val questionList: Question,
    private val answerOptions: List<String>,
    private val listener: OnItemClickListener,
    private val submitClickListener: OnSubmitClickListener,
) : RecyclerView.Adapter<UserDetailsAdapter.QuestionViewHolder>() {

    private var selectedAnswerOption: String? = null
    private var isAnswerOptionSelected = false
    var correctAnswerFound = false

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.question_list, parent, false)
        return QuestionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {
        val currentQuestion = questionList
        holder.questionTextView.text = currentQuestion.question
        holder.submitButton.setOnClickListener {
            submitClickListener.onSubmitClick()

        }


        val currentAnswerOptions = answerOptions
        val answerTextViews = arrayOf(holder.answerATextView, holder.answerBTextView, holder.answerCTextView, holder.answerDTextView, holder.answerETextView)

        for (i in answerTextViews.indices) {
            if (i >= currentAnswerOptions.size || currentAnswerOptions[i].isNullOrEmpty()) {
                answerTextViews[i].visibility = View.GONE
                answerTextViews[i].isChecked = false
            } else {
                answerTextViews[i].visibility = View.VISIBLE
                answerTextViews[i].text = currentAnswerOptions[i]
                answerTextViews[i].isChecked = currentAnswerOptions[i] == selectedAnswerOption
                answerTextViews[i].setOnClickListener {
                    answerTextViews[i].isChecked = true
                    updateSelectedAnswerOption(currentAnswerOptions[i])

                    val correctAnswer = currentQuestion.correctAnswers?.let { correctAnswers ->
                        when (currentAnswerOptions[i]) {
                            currentQuestion.answers?.answerA -> correctAnswers.answerACorrect
                            currentQuestion.answers?.answerB -> correctAnswers.answerBCorrect
                            currentQuestion.answers?.answerC -> correctAnswers.answerCCorrect
                            currentQuestion.answers?.answerD -> correctAnswers.answerDCorrect
                            currentQuestion.answers?.answerE -> correctAnswers.answerECorrect
                            currentQuestion.answers?.answerF -> correctAnswers.answerFCorrect
                            else -> null
                        }
                    }
                    if (correctAnswer == "true" && !correctAnswerFound) {
                        valueCorrect += 1
                        correctAnswerFound = true
                    }

                }
            }
        }
    }



    override fun getItemCount(): Int {
        return 1 // Only one question to display
    }

    inner class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rlQuestion: RelativeLayout = itemView.findViewById(R.id.rlAnswerA)
        val questionTextView: TextView = itemView.findViewById(R.id.tvAnswerOptionA)
        val answerATextView: RadioButton = itemView.findViewById(R.id.tvAnswerOptionB)
        val answerBTextView: RadioButton = itemView.findViewById(R.id.tvAnswerOptionC)
        val answerCTextView: RadioButton = itemView.findViewById(R.id.tvAnswerOptionD)
        val answerDTextView: RadioButton = itemView.findViewById(R.id.tvAnswerOptionE)
        val answerETextView: RadioButton = itemView.findViewById(R.id.tvAnswerOptionF)
        val submitButton: RelativeLayout = itemView.findViewById(R.id.rlSubmit)
    }

    interface OnItemClickListener {
        fun onItemClick(answerOption: String)
    }

    interface OnSubmitClickListener {
        fun onSubmitClick()
    }


    private fun updateSelectedAnswerOption(answerOption: String) {
        selectedAnswerOption = answerOption
        listener.onItemClick(answerOption)
        isAnswerOptionSelected = false
        notifyDataSetChanged()
    }
}
