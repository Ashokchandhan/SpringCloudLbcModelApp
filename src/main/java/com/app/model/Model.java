package com.app.model;

public class Model {

	private Integer mid;
	private String mcode;
	private String mtype;
	public Model(int i, String string, String string2) {
		super();
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	@Override
	public String toString() {
		return "Model [mid=" + mid + ", mcode=" + mcode + ", mtype=" + mtype + "]";
	}

}
