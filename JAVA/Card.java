public class Card extends Payment{
    Integer numerCard;
    Integer dateCard;
    Integer cvv;

    public Card(Double mount, Integer numerCard, Integer dateCard, Integer cvv){
        super(mount);
        this.numerCard = numerCard;
        this.dateCard = dateCard;
        this.cvv = cvv;
    }
    
}
