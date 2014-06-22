package sezemi;

import java.util.ArrayList;

import fileIO.LoadRecipeFile;

public class displayName { 
	
	

	public static void main(String[] args) {
		//recipe-data.txtを一行ずつ読み込み、その中のレシピの名前を標準出力する
		//LoadRecipeFile _lrf = new LoadRecipeFile("recipe-data.txt");
		
		ArrayList<String> recipeDataArray = new ArrayList<String>();
		recipeDataArray = LoadRecipeFile.load("recipe-data.txt");
		
		printRecipeData(recipeDataArray);
	}
	
	static void printRecipeData(ArrayList<String> _array) {
		int i;
		int len = _array.size();
		
		for(i=0; i<len; i++) {
			System.out.println(_array.get(i));
		}
	}

}
