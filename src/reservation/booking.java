package reservation;

public interface Room {
	//Room Number
	private int roomNumber;
	//True if room is smoking
	private boolean smoking;
	//True if room has a king sized 
	private boolean king;
	//true if room is single bed.
	private boolean single;
	
	public void setroomNumber(int number);
	public void setSmoking(boolean cig);
	public void setBedType(boolean smoking);
	public void setBedNumber(boolean single);
	
}
