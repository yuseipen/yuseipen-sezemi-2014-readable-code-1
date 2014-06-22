package sezemi;

import fileIO.LoadRecipeFile;

public class displayName {

	public static void main(String[] args) {
		//recipe-data.txtを一行ずつ読み込み、その中のレシピの名前を標準出力する
		LoadRecipeFile _lrf = new LoadRecipeFile("recipe-data.txt");
	}

}
