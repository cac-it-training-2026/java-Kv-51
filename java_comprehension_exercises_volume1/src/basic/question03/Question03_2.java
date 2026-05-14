package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {
		int bassPrice = 1200; // 通常料金

		int tickets = 3; //購入可能枚数

		int reducedPrice = (bassPrice - 200); //値下げ後の料金
		int reducedTickets = --tickets;
		int totalPrice = (reducedPrice * reducedTickets);

		double taxRate = 1.1; //税率
		int totalWithTax = (int) (totalPrice * taxRate);

		System.out.println("購入枚数は" + reducedTickets + "枚です。");
		System.out.println("値下げ後の１枚あたりの料金は" + reducedPrice + "円です。");
		System.out.println("合計金額（税抜）は" + totalPrice + "です。");
		System.out.println("合計金額（税込）は" + totalWithTax + "です。");
	}
}
