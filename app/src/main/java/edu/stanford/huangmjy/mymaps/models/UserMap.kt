package edu.stanford.huangmjy.mymaps.models

import edu.stanford.huangmjy.mymaps.Place
import java.io.Serializable

data class UserMap(val title: String, val places: List<Place>) : Serializable