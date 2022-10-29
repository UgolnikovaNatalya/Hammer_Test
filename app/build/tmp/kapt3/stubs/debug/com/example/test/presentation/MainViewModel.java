package com.example.test.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/test/presentation/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "useCase", "Lcom/example/test/usecases/GetCocktailUseCase;", "app", "Landroid/app/Application;", "(Lcom/example/test/usecases/GetCocktailUseCase;Landroid/app/Application;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/test/presentation/States;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "checkInternetConnection", "", "load", "", "MainViewModelFactory", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.test.usecases.GetCocktailUseCase useCase = null;
    private final androidx.lifecycle.MutableLiveData<com.example.test.presentation.States> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.test.presentation.States> state = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.test.usecases.GetCocktailUseCase useCase, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.test.presentation.States> getState() {
        return null;
    }
    
    public final void load() {
    }
    
    private final boolean checkInternetConnection() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/test/presentation/MainViewModel$MainViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "useCase", "Lcom/example/test/usecases/GetCocktailUseCase;", "(Lcom/example/test/usecases/GetCocktailUseCase;)V", "getUseCase", "()Lcom/example/test/usecases/GetCocktailUseCase;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class MainViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private final com.example.test.usecases.GetCocktailUseCase useCase = null;
        
        public MainViewModelFactory(@org.jetbrains.annotations.NotNull()
        com.example.test.usecases.GetCocktailUseCase useCase) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.test.usecases.GetCocktailUseCase getUseCase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}