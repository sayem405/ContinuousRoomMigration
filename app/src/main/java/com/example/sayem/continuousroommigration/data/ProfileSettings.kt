package com.example.sayem.continuousroommigration.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import com.example.sayem.continuousroommigration.db.ID
import com.example.sayem.continuousroommigration.db.KEY
import com.example.sayem.continuousroommigration.db.PROFILE_SETTINGS

/**
 * Created by sayem on 3/14/2018.
 */
@Entity(tableName = PROFILE_SETTINGS)
data class ProfileSettings(@ColumnInfo(name = ID) var settingsID : String,
                           @ColumnInfo(name = KEY) var  key : String)