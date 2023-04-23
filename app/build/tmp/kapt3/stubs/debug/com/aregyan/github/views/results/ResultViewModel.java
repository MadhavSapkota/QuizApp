package com.aregyan.github.views.results;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/aregyan/github/views/results/ResultViewModel;", "Landroidx/lifecycle/ViewModel;", "userDetailsRepository", "Lcom/aregyan/github/repository/UserDetailsRepository;", "(Lcom/aregyan/github/repository/UserDetailsRepository;)V", "_resultText", "Landroidx/lifecycle/MutableLiveData;", "", "resultText", "Landroidx/lifecycle/LiveData;", "getResultText", "()Landroidx/lifecycle/LiveData;", "updateResultText", "", "newResult", "app_debug"})
public final class ResultViewModel extends androidx.lifecycle.ViewModel {
    private final com.aregyan.github.repository.UserDetailsRepository userDetailsRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _resultText = null;
    
    @javax.inject.Inject()
    public ResultViewModel(@org.jetbrains.annotations.NotNull()
    com.aregyan.github.repository.UserDetailsRepository userDetailsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getResultText() {
        return null;
    }
    
    public final void updateResultText(@org.jetbrains.annotations.NotNull()
    java.lang.String newResult) {
    }
}