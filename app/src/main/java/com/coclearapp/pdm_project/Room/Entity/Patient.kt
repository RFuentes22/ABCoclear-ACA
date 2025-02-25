package com.coclearapp.pdm_project.Room.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Patient")

data class Patient(
        @PrimaryKey(autoGenerate = true)
        var idPatient : Long = 0,
        @ColumnInfo(name = "Name_Patient")
        var Name_Patient: String,
        @ColumnInfo(name = "Date")
        var Date: String,
        @ColumnInfo(name = "Level")
        val Level: Int,
        @ColumnInfo(name = "idUser")
        var idUser: String

)
