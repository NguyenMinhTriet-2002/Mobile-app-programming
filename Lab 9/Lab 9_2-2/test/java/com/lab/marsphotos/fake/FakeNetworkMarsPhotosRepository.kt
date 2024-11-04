package com.lab.marsphotos.fake

import com.lab.marsphotos.data.MarsPhotosRepository
import com.lab.marsphotos.model.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository{
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
