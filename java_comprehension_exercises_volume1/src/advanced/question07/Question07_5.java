package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数：>");
			amounts[i] = Integer.parseInt(reader.readLine());
		}

		System.out.println("購入内容一覧：");

		int total = 0;
		double total10off = 0;
		int totalWithTax = 0;

		for (int i = 0; i < itemNames.length; i++) {
			double pricesWithTax = prices[i] * 1.1;
			System.out.println(itemNames[i] + ":単価" + prices[i] + "円（税込" + (int) pricesWithTax + "円)" + "×" + amounts[i]
					+ "個=" + (int) (pricesWithTax * amounts[i]) + "円");

			total += amounts[i] * prices[i];
			totalWithTax += (int) ((prices[i] * amounts[i]) * 1.1);
		} //出力・税抜の合計金額・税込の金額合計を出している 

		System.out.println("合計（税込）：" + totalWithTax + "円");

		total10off = (total * 0.9); //10%オフ 
		double total10offWithTax = total10off * 1.1;

		System.out.println("割引後合計（税込）：" + (int) total10offWithTax + "円");
	}//更新
}