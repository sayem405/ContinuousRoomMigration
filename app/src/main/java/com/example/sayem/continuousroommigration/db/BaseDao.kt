package com.example.sayem.continuousroommigration.db

import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Update

/**
 * Created by sayem on 3/14/2018.
 */
interface BaseDao<T> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public fun insert(data : T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public fun insert(dataList : List<T>)

    @Update
    public fun update(data : T)

    @Update
    public fun update(data : List<T>)

    @Delete
    fun delete(data : T)
}