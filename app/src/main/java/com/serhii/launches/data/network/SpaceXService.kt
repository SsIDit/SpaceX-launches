package com.serhii.launches.data.network

import com.serhii.launches.data.network.pojo.LaunchModel
import com.serhii.launches.data.network.pojo.RocketModel
import retrofit2.Response

class SpaceXService(private val api: SpaceXApi) {

    suspend fun getLatestLaunchesAsync(): Response<List<LaunchModel>> = api.getLatestLaunchesAsync()

    suspend fun getRocketAsync(id: String): Response<RocketModel> = api.getRocketAsync(id)
}
