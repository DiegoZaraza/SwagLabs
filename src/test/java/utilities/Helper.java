package utilities;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Helper {
    public Helper(){}

    public void validateCardList(List<WebElement> cards) {
        assertNotNull(cards, "Element list is null");
        assertFalse(cards.isEmpty(), "Element list is empty");
    }

    public int getRandomCardIndex(int size) {
        return new Random().nextInt(size) + 1;
    }
}
