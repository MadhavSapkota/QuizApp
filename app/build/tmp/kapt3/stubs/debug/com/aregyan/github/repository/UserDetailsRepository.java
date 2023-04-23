package com.aregyan.github.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/aregyan/github/repository/UserDetailsRepository;", "", "userDetailsService", "Lcom/aregyan/github/network/UserDetailsService;", "(Lcom/aregyan/github/network/UserDetailsService;)V", "getUserDetails", "", "Lcom/aregyan/github/model/Question;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserDetailsRepository {
    private final com.aregyan.github.network.UserDetailsService userDetailsService = null;
    
    @javax.inject.Inject()
    public UserDetailsRepository(@org.jetbrains.annotations.NotNull()
    com.aregyan.github.network.UserDetailsService userDetailsService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.aregyan.github.model.Question>> continuation) {
        return null;
    }
}