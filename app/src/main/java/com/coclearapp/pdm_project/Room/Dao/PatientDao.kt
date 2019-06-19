package com.coclearapp.pdm_project.Room.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.coclearapp.pdm_project.Room.Entity.Patient

@Dao
interface PatientDao {



    @Query("SELECT * from Patient ORDER BY Name_Patient ASC")
    fun getAllPatient(): LiveData<List<Patient>>



    @Query("SELECT * from Patient WHERE Name_Patient==:patient ")
    fun getByPatient(patient:String): LiveData<Patient>

    @Insert
    suspend fun insertPatient(patient: Patient)

    @Query("DELETE FROM Patient")
    fun deleteAllPatient()
}
