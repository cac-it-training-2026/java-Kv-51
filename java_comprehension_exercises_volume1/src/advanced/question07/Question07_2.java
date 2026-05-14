package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 550, 400, 100 };

		int[] amount = new int[5]; //5要素が入る配列を作成
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {
			System.out.print(itemNames[i] + "の購入数：> ");
			amount[i] = Integer.parseInt(reader.readLine()); //個数配列にiの順番でint変換した入力値を代入
		}

		int totalAll = 0;

		for (int i = 0; i < itemNames.length; i++) {
			int total = amount[i] * prices[i]; //iの順番で各配列から値を取り出す
			System.out.println(itemNames[i] + "：" + total + "円");

			totalAll += total;
		}

		System.out.println("合計金額：" + (totalAll) + "円");

		//使いまわしたい変数や配列を早めに見つけてforの外に置くこと
	}
}
