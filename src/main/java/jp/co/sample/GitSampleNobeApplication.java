package jp.co.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSampleNobeApplication {

	public static void main(String[] args) {
		//デプロイとサーバ起動時にコンソールに出力する。
		System.out.println("デプロイとサーバ起動を行います。");
		SpringApplication.run(GitSampleNobeApplication.class, args);
	
	
	}
}
