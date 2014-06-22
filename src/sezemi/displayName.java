package sezemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class displayName {

	public static void main(String[] args) {
		//recipe-data.txtを一行ずつ読み込み、その中のレシピの名前を標準出力する
		try{
			//ファイルの読み込み
			File f = new File("recipe-data.txt");
			BufferedReader bf = new BufferedReader(new FileReader(f));
			
			//読み込んだファイルを一行ずつ読み込んで内容がなくなるまで出力。
			String recipe_name;
			while(true){
				recipe_name = bf.readLine();
				
				//次の行がない場合には脱出
				if(recipe_name == null){
					break;
				}
				System.out.println(recipe_name);
			}
			bf.close();
		}catch(FileNotFoundException e){
			System.err.println("ファイルが見つかりません");
		}catch(IOException e){
			System.err.println("入出力エラーです");
		}
	}

}
