package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[itemNames.length]; //登録商品の数を要素数に設定して使いまわしたい配列を作成
		int[] stocks = new int[itemNames.length]; //登録商品の数を要素数に設定して使いまわしたい配列を作成

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の在庫：>");
			stocks[i] = Integer.parseInt(reader.readLine());
		}

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数：>");
			amounts[i] = Integer.parseInt(reader.readLine());
			if (amounts[i] > stocks[i]) { //要素数を設定してやると比較できる
				System.out.println("在庫を超えています。もう一度入力してください。");
				i--;
				continue;
			}
		}

		int total = 0;

		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：購入" + amounts[i] + "個");
			total += amounts[i] * prices[i]; //ループのたびに+=にしないと加算されて行かない
		}

		System.out.println("合計金額：" + total + "円");

	}
}
