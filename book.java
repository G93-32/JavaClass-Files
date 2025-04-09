package inheritance;

public class book 
{
private String Publisher;
private double Price;
private String audience;
private int volume;


public book(String Publisher, double Price, String audience, int volume)
{
	this.Publisher = Publisher;
	this.Price = Price;
	this.audience = audience;
	this.volume = volume;
}
public String getPublisher() {
    return Publisher;
}
public double getPrice() {
	return Price;
}
public String getaudience() {
	return audience;
}
public int getvolume() {
	return volume;
}

}
}
}
