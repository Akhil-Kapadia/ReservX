package reservation;

import java.util.ArrayList;

public class RoomRegister {
	private ArrayList<RoomType> register = new ArrayList<RoomType>(37);
	
	/**
	 * Creates a room of NonSmoking Single king bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createNSSK(int RoomNumber) {
		NonSmokingSingleKing nssk = new NonSmokingSingleKing(RoomNumber,true);
		register.add(RoomNumber - 111, nssk);
	}
	
	/**
	 * Creates a room of Smoking Single king bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createSSK(int RoomNumber) {
		SmokingSingleKing ssk = new SmokingSingleKing(RoomNumber,true);
		register.add(RoomNumber - 111, ssk);
	}
	
	/**
	 * Creates a room of NonSmoking Single queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createNSSQ(int RoomNumber) {
		NonSmokingSingleQueen nssq = new NonSmokingSingleQueen(RoomNumber,true);
		register.add(RoomNumber - 111, nssq);
	}
	
	/**
	 * Creates a room of Smoking Single queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createSSQ(int RoomNumber) {
		SmokingSingleQueen ssq = new SmokingSingleQueen(RoomNumber,true);
		register.add(RoomNumber - 111, ssq);
	}
	/**
	 * Creates a room of NonSmoking Double Queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createNSDQ(int RoomNumber) {
		NonSmokingDoubleQueen nsdq = new NonSmokingDoubleQueen(RoomNumber, true);
		register.add(RoomNumber - 111, nsdq);
	}
	
	/**
	 * Creates a room of Smoking Double queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createSDQ(int RoomNumber) {
		SmokingDoubleQueen sdq = new SmokingDoubleQueen(RoomNumber, true);
		register.add(RoomNumber - 111, sdq);
	}
	
	/**
	 * Creates a custom room of specified number, smoking, bedsize, bednumber 
	 * and vacancy.
	 * @param num
	 */
	public void createRoom(int RoomNumber, boolean smoking, boolean king, 
	int bedNumber, boolean vacant) {
		Room newRoom = new Room(RoomNumber, smoking, king, bedNumber, vacant);
		register.add(RoomNumber - 111, newRoom);
	}



}
