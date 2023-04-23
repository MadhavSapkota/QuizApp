package com.aregyan.github.views.userDetails;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/aregyan/github/views/userDetails/UserDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "userDetailsRepository", "Lcom/aregyan/github/repository/UserDetailsRepository;", "(Lcom/aregyan/github/repository/UserDetailsRepository;)V", "_error", "Landroidx/lifecycle/MutableLiveData;", "", "_questions", "", "Lcom/aregyan/github/model/Question;", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "isFirstLoad", "", "()Z", "setFirstLoad", "(Z)V", "questions", "getQuestions", "getUserDetails", "", "app_debug"})
public final class UserDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.aregyan.github.repository.UserDetailsRepository userDetailsRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.aregyan.github.model.Question>> _questions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.aregyan.github.model.Question>> questions = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> error = null;
    private boolean isFirstLoad = true;
    
    @javax.inject.Inject()
    public UserDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.aregyan.github.repository.UserDetailsRepository userDetailsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.aregyan.github.model.Question>> getQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    public final boolean isFirstLoad() {
        return false;
    }
    
    public final void setFirstLoad(boolean p0) {
    }
    
    public final void getUserDetails() {
    }
}