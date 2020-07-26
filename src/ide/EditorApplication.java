package ide;

import source.AnimatedButton;

public class EditorApplication {

	public static void main(String[] args) {
		 DeveloperAssistantPlugin.getSuggestions(AnimatedButton.class).forEach(System.out::println);;

	}

}
