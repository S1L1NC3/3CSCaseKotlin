package com.dmd.a3cscasejava.models
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class UltraSunUltraMoon (

	@SerializedName("front_default") val front_default : String,
	@SerializedName("front_female") val front_female : String,
	@SerializedName("front_shiny") val front_shiny : String,
	@SerializedName("front_shiny_female") val front_shiny_female : String
) : Serializable