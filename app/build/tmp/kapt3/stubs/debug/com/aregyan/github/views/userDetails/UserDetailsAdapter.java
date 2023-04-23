package com.aregyan.github.views.userDetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003!\"#B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/aregyan/github/views/userDetails/UserDetailsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/aregyan/github/views/userDetails/UserDetailsAdapter$QuestionViewHolder;", "questionList", "Lcom/aregyan/github/model/Question;", "answerOptions", "", "", "listener", "Lcom/aregyan/github/views/userDetails/UserDetailsAdapter$OnItemClickListener;", "submitClickListener", "Lcom/aregyan/github/views/userDetails/UserDetailsAdapter$OnSubmitClickListener;", "(Lcom/aregyan/github/model/Question;Ljava/util/List;Lcom/aregyan/github/views/userDetails/UserDetailsAdapter$OnItemClickListener;Lcom/aregyan/github/views/userDetails/UserDetailsAdapter$OnSubmitClickListener;)V", "correctAnswerFound", "", "getCorrectAnswerFound", "()Z", "setCorrectAnswerFound", "(Z)V", "isAnswerOptionSelected", "selectedAnswerOption", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateSelectedAnswerOption", "answerOption", "OnItemClickListener", "OnSubmitClickListener", "QuestionViewHolder", "app_debug"})
public final class UserDetailsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.aregyan.github.views.userDetails.UserDetailsAdapter.QuestionViewHolder> {
    private final com.aregyan.github.model.Question questionList = null;
    private final java.util.List<java.lang.String> answerOptions = null;
    private final com.aregyan.github.views.userDetails.UserDetailsAdapter.OnItemClickListener listener = null;
    private final com.aregyan.github.views.userDetails.UserDetailsAdapter.OnSubmitClickListener submitClickListener = null;
    private java.lang.String selectedAnswerOption;
    private boolean isAnswerOptionSelected = false;
    private boolean correctAnswerFound = false;
    
    public UserDetailsAdapter(@org.jetbrains.annotations.NotNull()
    com.aregyan.github.model.Question questionList, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> answerOptions, @org.jetbrains.annotations.NotNull()
    com.aregyan.github.views.userDetails.UserDetailsAdapter.OnItemClickListener listener, @org.jetbrains.annotations.NotNull()
    com.aregyan.github.views.userDetails.UserDetailsAdapter.OnSubmitClickListener submitClickListener) {
        super();
    }
    
    public final boolean getCorrectAnswerFound() {
        return false;
    }
    
    public final void setCorrectAnswerFound(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.aregyan.github.views.userDetails.UserDetailsAdapter.QuestionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.aregyan.github.views.userDetails.UserDetailsAdapter.QuestionViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void updateSelectedAnswerOption(java.lang.String answerOption) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018\u00a8\u0006\u001d"}, d2 = {"Lcom/aregyan/github/views/userDetails/UserDetailsAdapter$QuestionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/aregyan/github/views/userDetails/UserDetailsAdapter;Landroid/view/View;)V", "answerATextView", "Landroid/widget/RadioButton;", "getAnswerATextView", "()Landroid/widget/RadioButton;", "answerBTextView", "getAnswerBTextView", "answerCTextView", "getAnswerCTextView", "answerDTextView", "getAnswerDTextView", "answerETextView", "getAnswerETextView", "questionTextView", "Landroid/widget/TextView;", "getQuestionTextView", "()Landroid/widget/TextView;", "rlQuestion", "Landroid/widget/RelativeLayout;", "getRlQuestion", "()Landroid/widget/RelativeLayout;", "setRlQuestion", "(Landroid/widget/RelativeLayout;)V", "submitButton", "getSubmitButton", "app_debug"})
    public final class QuestionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.RelativeLayout rlQuestion;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView questionTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RadioButton answerATextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RadioButton answerBTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RadioButton answerCTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RadioButton answerDTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RadioButton answerETextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.RelativeLayout submitButton = null;
        
        public QuestionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getRlQuestion() {
            return null;
        }
        
        public final void setRlQuestion(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getQuestionTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RadioButton getAnswerATextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RadioButton getAnswerBTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RadioButton getAnswerCTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RadioButton getAnswerDTextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RadioButton getAnswerETextView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getSubmitButton() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/aregyan/github/views/userDetails/UserDetailsAdapter$OnItemClickListener;", "", "onItemClick", "", "answerOption", "", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        java.lang.String answerOption);
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/aregyan/github/views/userDetails/UserDetailsAdapter$OnSubmitClickListener;", "", "onSubmitClick", "", "app_debug"})
    public static abstract interface OnSubmitClickListener {
        
        public abstract void onSubmitClick();
    }
}