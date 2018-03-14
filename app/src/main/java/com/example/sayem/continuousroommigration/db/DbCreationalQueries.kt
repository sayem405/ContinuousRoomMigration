package com.example.sayem.continuousroommigration.db

/**
 * Created by sayem on 3/14/2018.
 */
const val CREATE_PROFILE_TABLE = "CREATE TABLE $PROFILE ($ID TEXT PRIMARY KEY, $NAME TEXT NOT NULL)"
const val CREATE_PROFILE_SETTINGS_TABLE = "CREATE TABLE $PROFILE ($ID TEXT PRIMARY KEY, $KEY TEXT NOT NULL)"