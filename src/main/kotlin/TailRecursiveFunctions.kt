/**
 * Class untuk menghitung faktorial menggunakan tail recursion.
 */
class TailRecursiveFunctions {

    /**
     * Menghitung faktorial dari sebuah angka menggunakan tail recursion.
     *
     * Faktorial dari sebuah angka n (dilambangkan sebagai n!) adalah hasil perkalian
     * semua bilangan bulat positif kurang dari atau sama dengan n.
     * Misalnya, 5! = 5 * 4 * 3 * 2 * 1 = 120.
     *
     * @param n Angka yang akan dihitung faktorialnya. Harus bilangan bulat positif atau nol.
     * @param acc Akumulator untuk hasil rekursi. Nilai awal harus 1.
     * @return Faktorial dari angka yang diberikan.
     * @throws IllegalArgumentException jika n kurang dari nol.
     */
    tailrec fun factorial(n: Int, acc: Long = 1L): Long {
        require(n >= 0) { "n harus bilangan bulat positif atau nol." }
        return if (n == 0 || n == 1) {
            acc
        } else {
            factorial(n - 1, acc * n)
        }
    }
}

fun main() {
    val tailRecursiveFunctions = TailRecursiveFunctions()

    // Menghitung faktorial menggunakan tail recursion
    val number = 5
    val factorialResult = tailRecursiveFunctions.factorial(number)
    println("Faktorial dari $number adalah $factorialResult")
}