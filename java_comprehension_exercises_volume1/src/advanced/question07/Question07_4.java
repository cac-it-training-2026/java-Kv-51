package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		double priceWithTax = 0; //税込金額用の変数

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数：>");
			amounts[i] = Integer.parseInt(reader.readLine());

			priceWithTax += (prices[i] * amounts[i]) * 1.1; //ループのたびに+=にしないと加算されていかない
			//各商品*1.1の合計と合計金額*1.1だと若干端数が違う
		}

		int total = 0;
		double total10off = 0;

		for (int i = 0; i < itemNames.length; i++) {
			total += amounts[i] * prices[i]; //ループのたびに+=にしないと加算されていかない
		}

		if (total >= 5000) {
			total10off = (total * 0.9); //10%オフ 
		}

		System.out.println("割引前合計：" + total + "円");
		System.out.println("割引摘要（10%OFF）：" + (int) total10off + "円");
		System.out.println("税込合計：" + (int) priceWithTax + "円");
	}

}
