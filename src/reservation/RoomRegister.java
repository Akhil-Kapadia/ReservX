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
		RoomType nssk = new RoomType(RoomNumber, false, true, 1);
		register.add(RoomNumber - 111, nssk);
	}
	
	/**
	 * Creates a room of Smoking Single king bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createSSK(int RoomNumber) {
		RoomType nssk = new RoomType(RoomNumber, true, true, 1);
		register.add(RoomNumber - 111, nssk);
	}
	
	/**
	 * Creates a room of NonSmoking Single queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createNSSQ(int RoomNumber) {
		RoomType nssk = new RoomType(RoomNumber, false, false, 1);
		register.add(RoomNumber - 111, nssk);
	}
	
	/**
	 * Creates a room of Smoking Single queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createSSQ(int RoomNumber) {
		RoomType nssk = new RoomType(RoomNumber, true, false, 1);
		register.add(RoomNumber - 111, nssk);
	}
	/**
	 * Creates a room of NonSmoking Double Queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createNSDQ(int RoomNumber) {
		RoomType nssk = new RoomType(RoomNumber, false, false, 2);
		register.add(RoomNumber - 111, nssk);
	}
	
	/**
	 * Creates a room of Smoking Double queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createSDQ(int RoomNumber) {
		RoomType nssk = new RoomType(RoomNumber, true, false, 2);
		register.add(RoomNumber - 111, nssk);
	}
	
	/**
	 * Creates a room of Smoking Triple queen bed room with the specified 
	 * room number and adds them to the registry.
	 * @param num
	 */
	public void createSTQ(int RoomNumber) {
		RoomType nssk = new RoomType(RoomNumber, true, false, 3);
		register.add(RoomNumber - 111, nssk);
	}



}
