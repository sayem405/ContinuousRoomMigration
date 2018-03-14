package com.example.sayem.continuousroommigration.db

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import com.example.sayem.continuousroommigration.data.Profile

/**
 * Created by sayem on 3/14/2018.
 */
class ProfileDao(var database: SQLiteDatabase) : BaseDao<Profile> {
    override fun insert(data: Profile) {
        val contentValue = ContentValues()
        contentValue.put(ID, data.profileId)
        contentValue.put(NAME, data.name)

        database.insert(PROFILE, null, contentValue)
    }

    override fun insert(dataList: List<Profile>) {
        for (data in dataList) {
            val contentValue = ContentValues()
            contentValue.put(ID, data.profileId)
            contentValue.put(NAME, data.name)

            database.insert(PROFILE, null, contentValue)
        }
    }

    override fun update(data: Profile) {
        val contentValue = ContentValues()
        contentValue.put(ID, data.profileId)
        contentValue.put(NAME, data.name)

        val args = Array<String>(1, {data.profileId})

        database.update(PROFILE, contentValue, "$ID = ?", args)
    }

    override fun update(data: List<Profile>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(data: Profile) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}