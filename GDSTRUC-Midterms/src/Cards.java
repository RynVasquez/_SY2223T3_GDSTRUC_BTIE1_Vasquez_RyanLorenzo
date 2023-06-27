import java.util.Objects;
import java.util.Scanner;

public class Cards {
    private String cardName;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Cards(String cardName){
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "cardName='" + cardName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return Objects.equals(cardName, cards.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardName);
    }
}
