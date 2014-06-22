package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadRecipeFile {
	
	public LoadRecipeFile (final String _filePath){ 
		
	}
	
	public static ArrayList<String> load (final String _filePath){ 
		//ファイルの読み込みを行なうメソッド
		//引数で指定されたファイルを一行ずつ読み込み、ArrayList<String>型として返す
		
		ArrayList<String> recipeDataArray = new ArrayList<String>();
		
		try{
			//ファイルの読み込み
			File f = new File(_filePath);
			BufferedReader bf = new BufferedReader(new FileReader(f));
			
			//読み込んだファイルを一行ずつ読み込んで内容がなくなるまで出力。
			String recipe_name;
			while(true){
				recipe_name = bf.readLine();
				
				//次の行がない場合には脱出
				if(recipe_name == null){
					break;
				}
				
				//すぐに出力せずに、配列として保持し呼び出し側のクラスに渡すように変更
				//レシピをIDなどと紐付けて管理するため
				//change ishikawakenji//////////////
				recipeDataArray.add(recipe_name);
				////////////////////////////////////
				//System.out.println(recipe_name);
				////////////////////////////////////
				
			}
			bf.close();
		}catch(FileNotFoundException e){
			System.err.println("ファイルが見つかりません");
		}catch(IOException e){
			System.err.println("入出力エラーです");
		}
		
		//add ishikawakenji/////////////////
		return recipeDataArray;
	}
}
