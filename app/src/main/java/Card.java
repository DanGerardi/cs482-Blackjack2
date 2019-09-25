/**
 *  represents a card in the deck
 */
public class Card
{
    /**
     *  initiation of suit and rank
     *  represented by integers
     */
    int suit =0;
    int rank =0;

    /**
     * Constructor for the card
     * @param suit
     * @param rank
     */
    public Card(int suit , int rank)
    {
        this.suit = suit;
        this.rank = rank;

    }
}
