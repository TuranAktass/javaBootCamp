package day4_assignment3.entities;

public class Game {

	private int id;
	private String name;
	private String publisher;
	private double price;
	
	public Game() {
		
	}

	public Game(int id, String name, String publisher, double price) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
