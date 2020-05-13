package reservation;

public interface booking {
	//Room Number
	private int roomNumber;
	//True if room is smoking
	private boolean smoking;
	//True if room has a king sized 
	private boolean king;
	//Number of beds in room
	int bedNumber;
	
	//Getter and Setters
	public void setroomNumber(int number);
	public int getroomNumber();
	
	public void setSmoking(boolean cig);
	public boolean getSmoking();
	
	public void setBedType(boolean size);
	public boolean getBedType(boolean size);
	
	public void setBedNumber(int beds);
	public void getBedNumber(int beds);
	
}
