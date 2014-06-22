package fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoadRecipeFile {
	
	public LoadRecipeFile (String _filePath){ 
		
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
