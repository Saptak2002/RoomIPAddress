package com.programming.springmysqlroomaddress;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
@Entity
@Table
public class RoomIPAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Sno;
	@Column(name="RoomType")
	private String RoomType;
	@Column(name="RoomIPAddress")
	private String RoomIPAddress;
	
	public RoomIPAddress(int sno, String roomType, String roomIPAddress) {
		super();
		RoomType = roomType;
		RoomIPAddress = roomIPAddress;
	}

	public int getSno() {
		return Sno;
	}

	public void setSno(int sno) {
		Sno = sno;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
	}

	public String getRoomIPAddress() {
		return RoomIPAddress;
	}

	public void setRoomIPAddress(String roomIPAddress) {
		RoomIPAddress = roomIPAddress;
	}
	
	}
	


