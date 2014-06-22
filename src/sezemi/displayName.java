package sezemi;

import java.lang.reflect.Array;
import java.util.ArrayList;

import fileIO.LoadRecipeFile;

public class displayName { 
	
	final static String SELECT_RECIPE_ALL = "ALL";
	final static String SELECT_RECIPE_BY_ID = "ID";
	

	public static void main(String[] args) {
		//recipe-data.txtを一行ずつ読み込み、その中のレシピの名前を標準出力する
		//LoadRecipeFile _lrf = new LoadRecipeFile("recipe-data.txt");
		
		ArrayList<String> recipeDataArray = new ArrayList<String>();
		recipeDataArray = LoadRecipeFile.load("recipe-data.txt");
		
		if(args.length == 0){
			printRecipeData(recipeDataArray, SELECT_RECIPE_ALL, null);
		}else{
			printRecipeData(recipeDataArray, SELECT_RECIPE_BY_ID, args);
		}
		
		
	}
	
	static void printRecipeData(ArrayList<String> _array, String _type, String[] _str_id) {
		
		int i;
		int len;
		
		switch(_type){
			case SELECT_RECIPE_ALL :
				//すべてのIDのレシピを出力
				len = _array.size();
				
				for(i=0; i<len; i++) {
					System.out.println(Integer.valueOf(i+1) + ": "  + _array.get(i));
				}
			break;
			case SELECT_RECIPE_BY_ID :
				//第三引数で指定されたIDのレシピのみを出力
				//存在するレシピIDの最大数
				len = _str_id.length;
				int max_recipe_id = _array.size();
				
				for(i=0; i<len; i++) { 
					//_idは文字列型なので、intに変換
					int _intid = Integer.valueOf(_str_id[i]);
					
					//対象となるidがない場合は何も出力しない
					if(_intid <= 0 || _intid > max_recipe_id) return ;
					
					//該当するレシピを出力
					System.out.println(_intid + ": " + _array.get(_intid-1));
				}
				
				
			break;
		}
	}
	

}
