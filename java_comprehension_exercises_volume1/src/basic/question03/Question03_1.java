package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_1 {

	public static void main(String[] args) {
		int price = 30;
		int totalBudget = 300; //購入予算
		int quantity = (totalBudget / price); //購入個数
		System.out.println("商品の購入数は" + quantity + "個です。");
	}
}
