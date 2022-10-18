package com.example.test.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/example/test/presentation/CollapsedImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/test/presentation/CollapsedImageAdapter$ViewHolder;", "()V", "imageList", "", "Lcom/example/test/api/Drink;", "getImageList", "()Ljava/util/List;", "setImageList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showImages", "list", "ViewHolder", "app_debug"})
public final class CollapsedImageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.test.presentation.CollapsedImageAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.test.api.Drink> imageList;
    
    public CollapsedImageAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.test.api.Drink> getImageList() {
        return null;
    }
    
    public final void setImageList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.test.api.Drink> p0) {
    }
    
    public final void showImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.test.api.Drink> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.test.presentation.CollapsedImageAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.test.presentation.CollapsedImageAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/test/presentation/CollapsedImageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "item", "Landroid/view/View;", "(Landroid/view/View;)V", "setInfo", "", "data", "Lcom/example/test/api/Drink;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View item) {
            super(null);
        }
        
        public final void setInfo(@org.jetbrains.annotations.NotNull()
        com.example.test.api.Drink data) {
        }
    }
}