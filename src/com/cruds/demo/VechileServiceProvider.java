package com.cruds.demo;

public class VechileServiceProvider {

	//IVechicleProvider ivp=new VRLTransport();
	IVechicleProvider vp;
	
	public void showvechile()
	{
		System.out.println(vp.getVechile());
	}
	//setter injection
	public void setVp(IVechicleProvider vp) {
		this.vp = vp;
	}
	
}
