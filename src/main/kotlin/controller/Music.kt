package controller

import model.MusicGender

class Music {

    fun musicFactory(
        title: String,
        duration: Short,
        musicGender: MusicGender,
        yearOfRelease: Short,
        album: String,
        composer: String,
        record: String
    )  = model.Music(
        title = title,
        yearOfRelease = yearOfRelease,
        duration = duration,
        musicGender = musicGender,
        album = album,
        composer = composer,
        record = record
    )

}