package com.lab.marsphotos.fake

import com.lab.marsphotos.model.MarsPhoto
import com.lab.marsphotos.network.MarsApiService

class FakeMarsApiService : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
