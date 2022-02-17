package model

data class Music(
    var title: String,
    var duration: Short,
    var musicGender: MusicGender,
    var yearOfRelease: Short,
    var album: String,
    var composer: String,
    var record: String
) {
    override fun toString(): String {
        return "A Música $title,\nfoi escrita pela banda $composer,\ntem duração de $duration segundos,\no ano de lançamento da mesma é $yearOfRelease,\nfoi gravada pela gravadora $record,\nseu álbum é $album,\nseu gênero é $musicGender.\n\n"
    }
}
