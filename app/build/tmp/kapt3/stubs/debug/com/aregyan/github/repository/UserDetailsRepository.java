package com.aregyan.github.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/aregyan/github/repository/UserDetailsRepository;", "", "userDetailsService", "Lcom/aregyan/github/network/UserDetailsService;", "questionDao", "Lcom/aregyan/github/database/QuestionDao;", "(Lcom/aregyan/github/network/UserDetailsService;Lcom/aregyan/github/database/QuestionDao;)V", "getUserDetails", "", "Lcom/aregyan/github/model/Question;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveQuestions", "", "questions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserDetailsRepository {
    private final com.aregyan.github.network.UserDetailsService userDetailsService = null;
    private final com.aregyan.github.database.QuestionDao questionDao = null;
    
    @javax.inject.Inject()
    public UserDetailsRepository(@org.jetbrains.annotations.NotNull()
    com.aregyan.github.network.UserDetailsService userDetailsService, @org.jetbrains.annotations.NotNull()
    com.aregyan.github.database.QuestionDao questionDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.aregyan.github.model.Question>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveQuestions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aregyan.github.model.Question> questions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}