/**
 * Class untuk menghitung faktorial, deret Fibonacci, dan melakukan traversal pohon biner.
 */
class RecursiveFunctions {

    /**
     * Menghitung faktorial dari sebuah angka menggunakan rekursi.
     *
     * Faktorial dari sebuah angka n (dilambangkan sebagai n!) adalah hasil perkalian
     * semua bilangan bulat positif kurang dari atau sama dengan n.
     * Misalnya, 5! = 5 * 4 * 3 * 2 * 1 = 120.
     *
     * @param n Angka yang akan dihitung faktorialnya. Harus bilangan bulat positif atau nol.
     * @return Faktorial dari angka yang diberikan.
     * @throws IllegalArgumentException jika n kurang dari nol.
     */
    fun factorial(n: Int): Long {
        require(n >= 0) { "n harus bilangan bulat positif atau nol." }
        return if (n == 0 || n == 1) {
            1L
        } else {
            n * factorial(n - 1)
        }
    }

    /**
     * Menghitung nilai ke-n dari deret Fibonacci menggunakan rekursi.
     *
     * Deret Fibonacci adalah deret angka di mana setiap angka adalah hasil penjumlahan
     * dari dua angka sebelumnya, dimulai dari 0 dan 1.
     * Misalnya, deret Fibonacci: 0, 1, 1, 2, 3, 5, 8, ...
     *
     * @param n Indeks dari deret Fibonacci yang akan dihitung. Harus bilangan bulat positif atau nol.
     * @return Nilai ke-n dari deret Fibonacci.
     * @throws IllegalArgumentException jika n kurang dari nol.
     */
    fun fibonacci(n: Int): Long {
        require(n >= 0) { "n harus bilangan bulat positif atau nol." }
        return when (n) {
            0 -> 0L
            1 -> 1L
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }
    }

    /**
     * Menelusuri pohon biner secara inorder menggunakan rekursi.
     *
     * Inorder traversal adalah metode traversal pohon biner di mana node kiri
     * dikunjungi terlebih dahulu, kemudian node saat ini, dan akhirnya node kanan.
     *
     * @param node Node akar dari pohon biner yang akan ditelusuri.
     */
    fun inorderTraversal(node: TreeNode?) {
        if (node != null) {
            inorderTraversal(node.left)
            println(node.value)
            inorderTraversal(node.right)
        }
    }
}

/**
 * Data class yang merepresentasikan node pada pohon biner.
 *
 * @param value Nilai dari node.
 * @param left Node anak kiri.
 * @param right Node anak kanan.
 */
data class TreeNode(val value: Int, val left: TreeNode? = null, val right: TreeNode? = null)

fun main() {
    val recursiveFunctions = RecursiveFunctions()

    // Menghitung faktorial
    val number = 5
    val factorialResult = recursiveFunctions.factorial(number)
    println("Faktorial dari $number adalah $factorialResult")

    // Menghitung Fibonacci
    val fibIndex = 7
    val fibonacciResult = recursiveFunctions.fibonacci(fibIndex)
    println("Fibonacci ke-$fibIndex adalah $fibonacciResult")

    // Traversal pohon biner
    val tree = TreeNode(1, TreeNode(2), TreeNode(3))
    println("Inorder traversal dari pohon biner:")
    recursiveFunctions.inorderTraversal(tree)
}