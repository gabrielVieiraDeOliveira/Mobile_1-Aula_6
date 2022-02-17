package controller

import model.MovieClassification
import model.MovieGender

class Movie {

    fun movieFactory(
        title: String,
        gender: MovieGender,
        duration: Short,
        yearOfRelease: Short,
        director: String,
        classification: MovieClassification,
        screenwriter: String
    ) = model.Movie(
        title = title,
        duration = duration,
        gender = gender,
        yearOfRelease = yearOfRelease,
        director = director,
        classification = classification,
        screenwriter = screenwriter
    )

}