/*
 ** Luis Ferrufino
 ** legendary-cards
 ** 6/17/19
 */
 
public class Card {

  private String suite; //can be "Hearts, "Diamonds", "Spades", or "Clubs"
  private String rank; //can be "A", "1" to "10", "J", "Q", or "K"
   
  public Card(String s, String r) {
  
    suite = s;
    rank = r;
  }
   
  public String getSuite() {
  
    return suite;
  }
  
  public String getRank() {
  
    return rank;
  }
  
  public String toString() {
  
    return "[ " + rank + " of " + suite;
  }
}
