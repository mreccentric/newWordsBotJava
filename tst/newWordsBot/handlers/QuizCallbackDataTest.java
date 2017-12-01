package newWordsBot.handlers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuizCallbackDataTest {
    @Test
    void serialize() {
        QuizCallbackData data = new QuizCallbackData("show me the World", 3);

        String serialized = data.serialize();

        assertEquals("/response 3 show me the World", serialized);
    }

    @Test
    void deserialize() {
        QuizCallbackData data = QuizCallbackData.deserialize("/response 3 show me the World");

        assertEquals("show me the World", data.getWord());
        assertEquals(3, data.getVariantIndex());
    }

}