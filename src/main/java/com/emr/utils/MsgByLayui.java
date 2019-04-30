package com.emr.utils;

import java.util.ArrayList;
import java.util.List;

import com.emr.pojo.Drug;

public class MsgByLayui {
	private int code;
	private String msg;
	private int count;
	private List<Drug> data = new ArrayList<>();
	public static MsgByLayui success() {
		MsgByLayui result = new MsgByLayui();
		result.setCode(0);
		result.setMsg("");
		return result;
	}
	public static MsgByLayui fail() {
		MsgByLayui result = new MsgByLayui();
		result.setCode(1);
		result.setMsg("");
		return result;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public List<Drug> getData() {
		return data;
	}
	public void setData(List<Drug> data) {
		this.data = data;
	}
	
}
