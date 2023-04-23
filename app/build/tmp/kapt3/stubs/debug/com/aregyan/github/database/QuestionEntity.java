package com.aregyan.github.database;

import java.lang.System;

@androidx.room.Entity(tableName = "question")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/aregyan/github/database/QuestionEntity;", "", "id", "", "question", "", "answers", "Lcom/aregyan/github/database/AnswersEntity;", "correctAnswer", "multipleCorrectAnswers", "(ILjava/lang/String;Lcom/aregyan/github/database/AnswersEntity;Ljava/lang/String;Ljava/lang/String;)V", "getAnswers", "()Lcom/aregyan/github/database/AnswersEntity;", "getCorrectAnswer", "()Ljava/lang/String;", "getId", "()I", "getMultipleCorrectAnswers", "getQuestion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class QuestionEntity {
    @androidx.room.PrimaryKey()
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String question = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private final com.aregyan.github.database.AnswersEntity answers = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String correctAnswer = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String multipleCorrectAnswers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.aregyan.github.database.QuestionEntity copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String question, @org.jetbrains.annotations.Nullable()
    com.aregyan.github.database.AnswersEntity answers, @org.jetbrains.annotations.Nullable()
    java.lang.String correctAnswer, @org.jetbrains.annotations.Nullable()
    java.lang.String multipleCorrectAnswers) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public QuestionEntity(int id, @org.jetbrains.annotations.Nullable()
    java.lang.String question, @org.jetbrains.annotations.Nullable()
    com.aregyan.github.database.AnswersEntity answers, @org.jetbrains.annotations.Nullable()
    java.lang.String correctAnswer, @org.jetbrains.annotations.Nullable()
    java.lang.String multipleCorrectAnswers) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aregyan.github.database.AnswersEntity component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.aregyan.github.database.AnswersEntity getAnswers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCorrectAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMultipleCorrectAnswers() {
        return null;
    }
}