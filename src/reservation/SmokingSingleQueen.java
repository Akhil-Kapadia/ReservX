package reservation;

public class SmokingSingleQueen implements RoomType {
	
	//The room number ranges from 111 to 148
	private int roomNumber;
	//True if room is vacant and ready for rent. False if occupied of closed.
	private boolean vacant;

	public SmokingSingleQueen(int roomNumber, boolean vacant) {
		this.roomNumber = roomNumber;
		this.vacant = vacant;
	}

	//Getters and Setters
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public boolean isSmoking() {
		return true;
	}

	public boolean isKing() {
		return false;
	}

	public int getBedNumber() {
		return 1;
	}

	public boolean isVacant() {
		return vacant;
	}

	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}
	
	public String toString() {
		String vacany = (isVacant()) ? "Vacant" : "not Vacant";
		return "Smoking Single Queen Room " + roomNumber + " is " + vacany;
	}
	


}
