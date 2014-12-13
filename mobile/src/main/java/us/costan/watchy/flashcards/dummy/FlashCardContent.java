package us.costan.watchy.flashcards.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample prompt for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class FlashCardContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<FlashCard> ITEMS = new ArrayList<FlashCard>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, FlashCard> ITEM_MAP = new HashMap<String, FlashCard>();

    static {
        // Add 3 sample cards.
        addItem(new FlashCard("1", "Romania", "Bucharest"));
        addItem(new FlashCard("2", "America", "Washington DC"));
        addItem(new FlashCard("3", "Korea", "Seoul"));
    }

    private static void addItem(FlashCard item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A flash card has a prompt and a correct answer.
     */
    public static class FlashCard {
        public String id;
        public String prompt;
        public String answer;

        public FlashCard(String id, String prompt, String answer) {
            this.id = id;
            this.prompt = prompt;
            this.answer = answer;
        }

        @Override
        public String toString() {
            return prompt;
        }
    }
}
