package com.aregyan.github.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/aregyan/github/database/UsersDao;", "", "getDatabaseUsers", "Landroidx/lifecycle/LiveData;", "", "Lcom/aregyan/github/database/DatabaseUserListItem;", "getUserDetails", "Lcom/aregyan/github/database/DatabaseUserDetails;", "user", "", "insertAll", "", "users", "insertUserDetails", "databaseUserDetails", "app_debug"})
public abstract interface UsersDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from DatabaseUserListItem")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.aregyan.github.database.DatabaseUserListItem>> getDatabaseUsers();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aregyan.github.database.DatabaseUserListItem> users);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from DatabaseUserDetails WHERE user LIKE :user")
    public abstract androidx.lifecycle.LiveData<com.aregyan.github.database.DatabaseUserDetails> getUserDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String user);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUserDetails(@org.jetbrains.annotations.NotNull()
    com.aregyan.github.database.DatabaseUserDetails databaseUserDetails);
}