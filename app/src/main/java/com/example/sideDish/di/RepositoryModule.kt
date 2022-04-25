//package com.example.sideDish.di
//
//import com.example.sideDish.data.source.FoodRepository
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object RepositoryModule {
//    @Provides
//    fun provideFoodRepository():FoodRepository{
//        return FoodRepository()
//    }
//}