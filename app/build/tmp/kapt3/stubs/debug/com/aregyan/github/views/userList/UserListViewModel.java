package com.aregyan.github.views.userList;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/aregyan/github/views/userList/UserListViewModel;", "Landroidx/lifecycle/ViewModel;", "userListRepository", "Lcom/aregyan/github/repository/UserListRepository;", "(Lcom/aregyan/github/repository/UserListRepository;)V", "username", "", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "app_debug"})
public final class UserListViewModel extends androidx.lifecycle.ViewModel {
    private final com.aregyan.github.repository.UserListRepository userListRepository = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    
    @javax.inject.Inject()
    public UserListViewModel(@org.jetbrains.annotations.NotNull()
    com.aregyan.github.repository.UserListRepository userListRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}