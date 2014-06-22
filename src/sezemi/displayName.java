package sezemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class displayName {

	public static void main(String[] args) {
		try{
			File f = new File("recipe-data.txt");
			BufferedReader bf = new BufferedReader(new FileReader(f));
			String recipe_name = bf.readLine();
			System.out.println(recipe_name);
		}catch(FileNotFoundException e){
			System.err.println("ファイルが見つかりません");
		}catch(IOException e){
			System.err.println("入出力エラーです");
		}
	}

}
