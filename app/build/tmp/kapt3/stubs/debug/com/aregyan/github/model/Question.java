package com.aregyan.github.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R \u0010\u001d\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR \u0010 \u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\"\u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R \u0010*\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR \u0010-\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR&\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u00107\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013\u00a8\u0006:"}, d2 = {"Lcom/aregyan/github/model/Question;", "", "()V", "answers", "Lcom/aregyan/github/model/Answers;", "getAnswers", "()Lcom/aregyan/github/model/Answers;", "setAnswers", "(Lcom/aregyan/github/model/Answers;)V", "category", "", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "correctAnswer", "getCorrectAnswer", "()Ljava/lang/Object;", "setCorrectAnswer", "(Ljava/lang/Object;)V", "correctAnswers", "Lcom/aregyan/github/model/CorrectAnswers;", "getCorrectAnswers", "()Lcom/aregyan/github/model/CorrectAnswers;", "setCorrectAnswers", "(Lcom/aregyan/github/model/CorrectAnswers;)V", "description", "getDescription", "setDescription", "difficulty", "getDifficulty", "setDifficulty", "explanation", "getExplanation", "setExplanation", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "multipleCorrectAnswers", "getMultipleCorrectAnswers", "setMultipleCorrectAnswers", "question", "getQuestion", "setQuestion", "tags", "", "Lcom/aregyan/github/model/Tag;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "tip", "getTip", "setTip", "app_debug"})
public final class Question {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "question")
    private java.lang.String question;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "description")
    private java.lang.Object description;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "answers")
    private com.aregyan.github.model.Answers answers;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "multiple_correct_answers")
    private java.lang.String multipleCorrectAnswers;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "correct_answers")
    private com.aregyan.github.model.CorrectAnswers correctAnswers;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "correct_answer")
    private java.lang.Object correctAnswer;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "explanation")
    private java.lang.Object explanation;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "tip")
    private java.lang.Object tip;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "tags")
    private java.util.List<com.aregyan.github.model.Tag> tags;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "category")
    private java.lang.String category;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "difficulty")
    private java.lang.String difficulty;
    
    public Question() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQuestion() {
        return null;
    }
    
    public final void setQuestion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aregyan.github.model.Answers getAnswers() {
        return null;
    }
    
    public final void setAnswers(@org.jetbrains.annotations.Nullable()
    com.aregyan.github.model.Answers p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMultipleCorrectAnswers() {
        return null;
    }
    
    public final void setMultipleCorrectAnswers(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aregyan.github.model.CorrectAnswers getCorrectAnswers() {
        return null;
    }
    
    public final void setCorrectAnswers(@org.jetbrains.annotations.Nullable()
    com.aregyan.github.model.CorrectAnswers p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCorrectAnswer() {
        return null;
    }
    
    public final void setCorrectAnswer(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExplanation() {
        return null;
    }
    
    public final void setExplanation(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTip() {
        return null;
    }
    
    public final void setTip(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.aregyan.github.model.Tag> getTags() {
        return null;
    }
    
    public final void setTags(@org.jetbrains.annotations.Nullable()
    java.util.List<com.aregyan.github.model.Tag> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDifficulty() {
        return null;
    }
    
    public final void setDifficulty(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}