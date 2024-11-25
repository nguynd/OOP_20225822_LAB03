package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.carts;
import hust.soict.dsai.aims.disc.DVD;

public class CartTest {
	public static void main(String[] args) {
		carts cart = new carts();
		
		DVD dvd1= new DVD("The Lion Kings","Animation","Roger Allers", 87, 24.95f);
		cart.addDVD(dvd1);
		
		DVD dvd2 = new DVD("Star Wars", "Science Fiction","George Lucas", 87, 24.95f);
		cart.addDVD(dvd2);
		
		DVD dvd3 = new DVD("Aladin", "Animation",18.99f);
		cart.addDVD(dvd3);
		
		cart.print();
		cart.searchTitle("lion");
		cart.searchID(4);
		cart.searchID(2);
	}
}