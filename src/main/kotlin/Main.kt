/**
 * 1996-2015 -- Gen Z
 * 1974-1995 -- Millennial
 * 1960-1973 -- Gen X
 * 0-1959 -- Baby Boomer
 */
fun main() {
    println("Enter year of birth")
    val year = readln().toInt()
    when (year) {
        in 1996..2015 -> print("Gen Z")
        in 1974..1995 -> print("Millennial")
        in 1960..1973 -> print("GenX")
        else -> print("Baby Boomer")
    }
}