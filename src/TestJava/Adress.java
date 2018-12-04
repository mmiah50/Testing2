package House;

public class Adress {
	
	int houseNumber;
	
	String houseName = "WhiteHouse";
	
	public String getHouseName() {
		return houseName;
		
	}
	
	public void numberOfBedroom() {
		System.out.println(houseName);
		
		House yourHouse = new House();
				yourHouse.NumberOfBedroom();
		
		Office myOffice = new Office();
		myOffice.displayOfficeAddress();
		
	}

}
