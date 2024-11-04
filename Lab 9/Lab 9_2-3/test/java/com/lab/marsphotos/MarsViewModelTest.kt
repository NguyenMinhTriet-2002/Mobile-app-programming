package com.lab.marsphotos

import com.lab.marsphotos.fake.FakeDataSource
import com.lab.marsphotos.fake.FakeNetworkMarsPhotosRepository
import com.lab.marsphotos.rules.TestDispatcherRule
import com.lab.marsphotos.ui.screens.MarsUiState
import com.lab.marsphotos.ui.screens.MarsViewModel
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(FakeDataSource.photosList),
                marsViewModel.marsUiState
            )
        }
}
