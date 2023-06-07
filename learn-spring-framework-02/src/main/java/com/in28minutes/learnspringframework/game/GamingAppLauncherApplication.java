package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {
//
//	@Bean
//	public GamingConsole game() {
//		var game = new PacmanGame();
//		return game;
//	}
//
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {

		try (var context =
					 new AnnotationConfigApplicationContext
							 (GamingAppLauncherApplication.class)){
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}

	}

}
