package org.tnsif.acc.c2tc.oops;

abstract class Monish
{
	void calling()
	{
		System.out.println("Phone is having calling Features");
		System.out.println();
	}
	abstract void AIIntegration();
	abstract void SatelliteFeatures();
	abstract void HealthMonitoring();
}

abstract class Samuel extends Monish
{

	@Override
	void AIIntegration() {
		System.out.println("Phone is integrated with AI");
		System.out.println();
	}

	@Override
	abstract void SatelliteFeatures(); 

	@Override
	abstract void HealthMonitoring();
	
}
 
 class Preran extends Samuel
 {

	@Override
	void SatelliteFeatures() {
		System.out.println("Phone is having SatelliteComm");
		System.out.println();
		
		
	}

	@Override
	void HealthMonitoring() {
		System.out.println("Phone is having HealthMonitoring ");
		System.out.println();
		
	}
	 
 }
public class AbstractionDemo {

	public static void main(String[] args) {
		Preran obj=new Preran();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteFeatures();
		obj.HealthMonitoring();

	}

}