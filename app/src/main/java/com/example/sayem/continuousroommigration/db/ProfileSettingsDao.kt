package com.example.sayem.continuousroommigration.db

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import com.example.sayem.continuousroommigration.data.ProfileSettings

/**
 * Created by sayem on 3/14/2018.
 */
class ProfileSettingsDao(var database: SQLiteDatabase) : BaseDao<ProfileSettings> {

    override fun insert(data: ProfileSettings) {
        val contentValue = ContentValues()
        contentValue.put(ID, data.settingsID)
        contentValue.put(NAME, data.key)

        database.insert(PROFILE_SETTINGS, null, contentValue)
    }

    override fun insert(dataList: List<ProfileSettings>) {
        for (data in dataList) {
            val contentValue = ContentValues()
            contentValue.put(ID, data.settingsID)
            contentValue.put(NAME, data.key)

            database.insert(PROFILE_SETTINGS, null, contentValue)
        }
    }

    override fun update(data: ProfileSettings) {
        val contentValue = ContentValues()
        contentValue.put(ID, data.settingsID)
        contentValue.put(NAME, data.key)

        val args = Array<String>(1, {data.settingsID})

        database.update(PROFILE_SETTINGS, contentValue, "$ID = ?", args)
    }

    override fun update(data: List<ProfileSettings>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(data: ProfileSettings) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}