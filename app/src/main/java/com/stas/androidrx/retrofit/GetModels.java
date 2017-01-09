package com.stas.androidrx.retrofit;

import com.stas.androidrx.model.Model;

import java.util.ArrayList;

import retrofit2.http.GET;
import rx.Observable;

/**
 * @author Stas
 * @since 09.01.17.
 */
public interface GetModels {
    @GET("rx-retrofit-and-android-screen-orientation.php")
    Observable<ArrayList<Model>> getModelsList();
}
