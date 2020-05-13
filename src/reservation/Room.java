package reservation;

public class Room {
	//The room number ranges from 111 to 148
	private int roomNumber;
	//True if the room is smoking or false if nonsmoking.
	private boolean smoking;
	//True if the room has king beds, false if its queen beds. 
	private boolean king;
	//The amount of beds in the room. Single, Double, Tri
	private int bedNumber;
	//True if room is vacant and ready for rent. False if occupied of closed.
	private boolean vacant;
	
	public Room(int roomNumber, boolean smoking, boolean king, int bedNumber,boolean vacant) {
		this.setRoomNumber(roomNumber);
		this.setSmoking(smoking);
		this.setKing(king);
		this.setBedNumber(bedNumber);
		this.setVacant(vacant);
	}

	//Getters and Setters
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public boolean isKing() {
		return king;
	}

	public void setKing(boolean king) {
		this.king = king;
	}

	public int getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(int bedNumber) {
		this.bedNumber = bedNumber;
	}

	public boolean isVacant() {
		return vacant;
	}

	public void setVacant(boolean vacant) {
		this.vacant = vacant;
	}
	

}
