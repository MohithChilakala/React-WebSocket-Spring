package projects.web.tictactoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TicTacToeApplication {
	public static void main(String[] args) {
		SpringApplication.run(TicTacToeApplication.class, args);
	}
}
