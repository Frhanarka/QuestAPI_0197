package com.example.p11.repositori

import com.example.p11.modeldata.DataSiswa
import com.example.p11.apiservice.ServiceApiSiswa
import retrofit2.Response

interface RepositoriDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void>
}
class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepositoriDataSiswa {
    override suspend fun getDataSiswa(): List<DataSiswa> =
        serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void> =
        serviceApiSiswa.postSiswa(dataSiswa)
}