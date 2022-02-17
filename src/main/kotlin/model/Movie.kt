package model

data class Movie(
    var title: String,
    var gender: MovieGender,
    var duration: Short,
    var yearOfRelease: Short,
    var director: String,
    var classification: MovieClassification,
    var screenwriter: String
) {
    override fun toString(): String {
        return "Filme: $title\nGênero: $gender\nDuração: $duration minutos\nAno de Lançamento: $yearOfRelease\nDiretor: $director\nClassificação Indicativa: $classification\nRoteirista: $screenwriter."
    }
}