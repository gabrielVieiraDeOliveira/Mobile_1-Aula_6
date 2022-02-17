package view

import model.MovieClassification
import model.MovieGender
import model.MusicGender

fun main() {

    val musicController = controller.Music()
    val sweetChildOMine = musicController.musicFactory(
        title = "Sweet Child O Mine",
        composer = "Guns n' Roses",
        album = "Appettite for Destruction",
        yearOfRelease = 1988,
        record = "Geffen Records",
        duration = 354,
        musicGender = MusicGender.ROCK
    )

    println(sweetChildOMine)

    val movieController = controller.Movie()
    val paranormalActivity = movieController.movieFactory(
        title = "Atividade Paranormal",
        gender = MovieGender.TERROR,
        duration = 86,
        yearOfRelease = 2007,
        director = "Oren Peli",
        classification = MovieClassification.MAOIRESDE18,
        screenwriter = "Oren Peli"
    )

    println(paranormalActivity)

}