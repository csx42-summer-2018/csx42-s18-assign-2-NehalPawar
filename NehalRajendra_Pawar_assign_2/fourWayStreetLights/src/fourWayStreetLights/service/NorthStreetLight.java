package fourWayStreetLights.service;

public class NorthStreetLight implements StreetLightsStateI{
StretLightsContext Obj1 ;
public NorthStreetLight (StretLightsContext Obj2){
this.Obj1=Obj2;
}

public StreetLightsStateI goNorth(){
	System.out.println("Already North is greeen.");
	return Obj1;
}


public void goWest(){}

public void goSouth(){}

public void goEast(){}

public void goRed(){}



}