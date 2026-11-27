package com.example.p11.apiservice

import com.example.p11.modeldata.DataSiswa
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body

interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(
        @Body dataSiswa: DataSiswa
    ): retrofit2.Response<Void>
}