package reservation;

public interface RoomType {
	/**
	 * Returns true if the room is vacant and ready to book.
	 * @return Boolean
	 */
	public boolean isVacant();
	/**
	 * Returns a string of what room type it is.
	 * @return
	 */
	public String toString();
	/**
	 * Returns the room number.
	 * @return INT	Ranging from 111-148
	 */
	public int getRoomNumber();
	/**
	 * Returns true if the room is smoking
	 * @return Boolean
	 */
	public boolean isSmoking();
	/**
	 * Returns whether the room has a King or Queen bed.
	 * @return Boolean
	 */
	public boolean isKing();
	/**
	 * Returns whether the room is a single, double or triple.
	 * @return INT	Ranges from 1 to 3
	 */
	public int getBedNumber();
	
	
}
