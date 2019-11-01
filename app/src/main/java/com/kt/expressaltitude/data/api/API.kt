package com.kt.expressaltitude.data.api

import com.kt.expressaltitude.Constants
import com.kt.expressaltitude.data.api.model.request.GuestAsArrivalBodyRequest
import com.kt.expressaltitude.data.api.model.response.DeviceItemResponse
import com.kt.expressaltitude.data.api.model.response.GuestDepartureResponse
import com.kt.expressaltitude.data.api.model.response.ResponsePutResource
import com.kt.expressaltitude.data.entities.guestdepartures.GuestDeparture
import com.kt.expressaltitude.data.entities.registrationcard.RegistrationCard
import com.kt.expressaltitude.data.entities.registrationcard.Resources
import retrofit2.Call
import retrofit2.http.*

interface API {
    @GET(Constants.REGISTRATION_CARD_PATH)
    fun getRegistrationCardAppStyle(): Call<RegistrationCard>

    @GET("/express-app/{id}")
    fun getRegistrationCardAppStyle(@Path("id") id: String): Call<RegistrationCard>

    @POST("/express-app/")
    fun createRegistrationCard(): Call<RegistrationCard>

    @PUT("/express-app/{id}")
    fun updateDetailRegistrationCard(@Path("id") id: String): Call<Void>

    @DELETE("/express-app/{id}")
    fun delete(@Path("id") id: String): Call<Void>

    @GET("/express-app/{id}/resources")
    fun getResources(@Path("id") id: String): Call<List<Resources>>

    @PUT("/express-app/{id}/resources/{id}")
    fun putResources(@Path("id") idRegistrationCard: String, @Path("id") idResources: String): Call<ResponsePutResource>

    @POST("/express-app/{id}/update-resources")
    fun postUpdateResources(@Path("id") id: String)

    @POST("/private/express-app/update-resources")
    fun postUpdateResources()

    @GET("/express-app/{id}/devices/")
    fun getDevices(@Path("id") id: String): Call<List<DeviceItemResponse>>

    @POST("/express-app/{id}/devices/{deviceId}")
    fun addDeviceToDevicesArray(@Path("id") id: String, @Path("deviceId") deviceId: String)

    @DELETE("/express-app/{id}/devices/{deviceId}")
    fun deleteDeviceItem(@Path("id") id: String, @Path("deviceId") deviceId: String)

    @POST("/express-app/{id}/logout")
    fun logout(@Path("id") id: String)

    @POST("/express-app/{id}/refresh")
    fun refresh(@Path("id") id: String)



    @GET("/guest-arrivals/")
    fun getArrivalByStatus(
        @Query("status") status: String?,
        @Query("propertyId") propertyId: String,
        @Query("reservationRef") reservationRef: String,
        @Query("deviceId") deviceId: String,
        @Query("arrivalDate") arrivalDate: String,
        @Query("reservationId") reservationId: String
    )

    @GET("/guest-arrivals/sign")
    fun getCurrentActiveGuestProfile()

    @GET("/guest-arrivals/details")
    fun getArrivalDetail()

    @POST("/guest-arrivals/")
    fun addGuestArrivalToRegistrationCard()

    @POST("/guest-arrivals/sign")
    fun postGuestArrivalSign()

    @GET("/guest-arrivals/{arrivalId}")
    fun getGuestArrival(@Path("arrivalId") arrivalId: String)



    @POST("/guest-departures/")
    fun addGuestAsArrival(@Body guestBody: GuestAsArrivalBodyRequest)

    @DELETE("/guest-departures/{deptId}")
    fun deleteGuestDeparture(@Path("deptId")deptId: String): Call<GuestDeparture>

    @GET("/guest-departures/details")
    fun getDepartures(): Call<GuestDepartureResponse>

//    @POST("/guest-departures/bill/sign")
//    fun postGuestDeparture: Call<GuestDeparture>


}