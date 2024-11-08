package com.lab.juicetracker.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lab.juicetracker.data.Juice
import com.lab.juicetracker.data.JuiceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

/**
 * ViewModel to retrieve, add, edit or delete a juice entry
 * from the [JuiceRepository]'s data source.
 */
class EntryViewModel(private val juiceRepository: JuiceRepository) : ViewModel() {

    fun getJuiceStream(id: Long): Flow<Juice?> = juiceRepository.getJuiceStream(id)

    fun saveJuice(
        id: Long,
        name: String,
        description: String,
        color: String,
        rating: Int
    ) {
        val juice = Juice(id, name, description, color, rating)
        viewModelScope.launch {
            if (id > 0) {
                juiceRepository.updateJuice(juice)
            } else {
                juiceRepository.addJuice(juice)
            }
        }
    }
}
