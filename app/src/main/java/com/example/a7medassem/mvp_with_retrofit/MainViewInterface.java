package com.example.a7medassem.mvp_with_retrofit;

public interface MainViewInterface {

    void showToast(String s);
    void displayMovies(MovieResponse movieResponse);
    void displayError(String s);
}
