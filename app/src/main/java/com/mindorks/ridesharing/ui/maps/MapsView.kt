package com.mindorks.ridesharing.ui.maps

import com.google.android.gms.maps.model.LatLng

interface MapsView {
    fun showNearByCabs(latLngList: List<LatLng>)
    fun informCabBook()
    fun showPath(latLngList: List<LatLng>)
    fun updateCabLocation(latLng: LatLng)
    fun informCabIsArriving()
    fun informCabArrived()
    fun informTripStart()
    fun informTripEnd()
    fun showRoutesNotAvailableError()
    fun showDirectionApiFailedError(error: String)
}