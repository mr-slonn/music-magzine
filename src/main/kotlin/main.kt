fun main() {
    val regular: Boolean = true;
    var amount: Int = 100000;
    println("покупка — $amount рублей");
    if (amount > 10000) {
        amount -= (amount / 100 * 5).toInt();
        println("после применения 5% скидки — $amount рублей.");
    } else if (amount > 1000) {
        amount -= 100;
        println("после применения  скидки в 100р — $amount рублей.");
    }

    if (regular) {
        amount -= (amount / 100 * 1).toInt();
        println("после применения 1% скидки — $amount рублей.");
    }
}