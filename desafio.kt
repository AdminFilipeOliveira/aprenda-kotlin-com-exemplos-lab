enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        
    }
}

fun main() {

    
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 0)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println()
        println("Usuário ${usuario.nome} matriculado/a na formação $nome.")
        println()
    }


    fun listarInscritos() {
        println()
        println("Usuários matriculados na formação $nome :")
        for (usuario in inscritos) {
            println("- ${usuario.nome}")

        }
    }

    fun calcularDuracaoTotal(): Int {
        var duracaoTotal = 0
        for (conteudo in conteudos) {
            duracaoTotal += conteudo.duracao
        }
        return duracaoTotal
    }
}


fun Formacao.listarConteudos() {
    println()
    println("Conteúdos da formação $nome (${nivel.name}):")
    for (conteudo in conteudos) {
        println("- ${conteudo.nome} (${conteudo.duracao} minutos)")

    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("Pedro")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60)
    val conteudo11 = ConteudoEducacional("Programação Orientada a Objetos Kotlin", 80)
    val conteudo12 = ConteudoEducacional("Tipos de Classes Kotlin ", 90)
    val conteudo2 = ConteudoEducacional("Introdução ao Python", 70)
    val conteudo21 = ConteudoEducacional("Programação Orientada a Objetos Python", 50)
    val conteudo22 = ConteudoEducacional("Tipos de Classes Python ", 90)
    val conteudo3 = ConteudoEducacional("Introdução ao Java", 90)
    val conteudo31 = ConteudoEducacional("Programação Orientada a Objetos Java", 120)
    val conteudo32 = ConteudoEducacional("Tipos de Classes Java ", 90)

    val formacao1 = Formacao("Kotlin", Nivel.BASICO, listOf(conteudo1, conteudo11,conteudo12))
    val formacao2 = Formacao("Python", Nivel.INTERMEDIARIO, listOf(conteudo2,conteudo21, conteudo22))
    val formacao3 = Formacao("Java", Nivel.DIFICIL, listOf(conteudo3,conteudo31, conteudo32))
    //TODO("Simule alguns cenários de teste. Para isso, crie

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao2.matricular(usuario2)
    formacao2.matricular(usuario3)
    formacao3.matricular(usuario1)

    formacao1.listarConteudos()
    formacao2.listarConteudos()
    formacao3.listarConteudos()



    formacao1.listarInscritos()
    formacao2.listarInscritos()
    formacao3.listarInscritos()

    val duracaoTotalFormacao1 = formacao1.calcularDuracaoTotal()
    val duracaoTotalFormacao2 = formacao2.calcularDuracaoTotal()
    val duracaoTotalFormacao3 = formacao3.calcularDuracaoTotal()
    println("Duração total da Formação em Kotlin: $duracaoTotalFormacao1 minutos")
    println("Duração total da Formação em Python: $duracaoTotalFormacao2 minutos")
    println("Duração total da Formação em Java: $duracaoTotalFormacao3 minutos")
}