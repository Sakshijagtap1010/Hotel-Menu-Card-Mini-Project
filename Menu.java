package comp.test.code;
//home work
public enum Menu {
 SWEET_LASSI(30),SPECIAL_LASSI(70),MANGO_LASSI(70),ICECREAM_LASSI(70),CHOCOLATE_LASSI(70);
	int price;
	private Menu(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}
