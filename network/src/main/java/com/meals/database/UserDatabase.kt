package com.meals.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.meals.dao.HeaderDao
import com.meals.entity.HeaderEntity

@Database(entities = [HeaderEntity::class], version = 1, exportSchema = false)
abstract class UserDatabase : RoomDatabase() {

    abstract fun mainDao(): HeaderDao

    companion object {
        private var INSTANCE: UserDatabase? = null
        private val lock = Any()

        fun getInstance(context: Context): UserDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, UserDatabase::class.java, "user.db")
                        .fallbackToDestructiveMigration()
                        .build()
                }

                return INSTANCE!!
            }
        }
    }

}