package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		String[] itemNames = new String[5]; //5要素入る配列を作成し使いまわせるように
		int[] itemPrice = new int[5]; //5要素入る配列を作成し使いまわせるように

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください：>");
			itemNames[i] = reader.readLine();
		}

		System.out.println("商品の単価を順に入力してください。");

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の単価：>");
			itemPrice[i] = Integer.parseInt(reader.readLine());
		}

		System.out.println("登録商品一覧");

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + "：" + itemPrice[i] + "円");
		}

	}
}
