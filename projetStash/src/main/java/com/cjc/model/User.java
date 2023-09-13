package com.cjc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User 
{
	private int uid;
	private String name;
	private String address;
	private long mobno;

}
