package com.example.sayem.continuousroommigration.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import com.example.sayem.continuousroommigration.db.ID
import com.example.sayem.continuousroommigration.db.NAME
import com.example.sayem.continuousroommigration.db.PROFILE

/**
 * Created by sayem on 3/14/2018.
 */
@Entity(tableName = PROFILE)
data class Profile(@ColumnInfo(name = ID) var profileId : String,
                   @ColumnInfo(name = NAME) var name : String)