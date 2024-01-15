package com.turkoglu.composedeneme.data.di

import android.app.Application
import androidx.room.Room
import com.turkoglu.composedeneme.data.local.FavoriteDB
import com.turkoglu.composedeneme.data.remote.MovieAPI
import com.turkoglu.composedeneme.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMovieApi(): MovieAPI {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieAPI::class.java)
    }
    @Provides
    @Singleton
    fun provideFavoritesDatabase(application: Application): FavoriteDB {
        return Room.databaseBuilder(
            application.applicationContext,
            FavoriteDB::class.java,
            "favorites_database"
        ).fallbackToDestructiveMigration().build()
    }

    /*
    @Provides
    @Singleton
    fun provideMovieRepository ( api: MovieAPI ) : MovieRepositoryImpl {
        return MovieRepositoryImpl(api)
    }
     */



}