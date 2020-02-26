package RootElement;

import java.awt.Color;

import javax.vecmath.Color3f;
import javax.vecmath.Vector3d;

public class DeviceFactory {
	public static Robot getRobot(String str, Vector3d pnt){
		if(str == null){
			return null;
		}
		if(str=="mapper"){
			return new Mapper(pnt, "mapper", new Color3f(Color.blue));
		}
		else if (str == "rescuer"){
			return new Rescuer(pnt, "rescuer", new Color3f(Color.yellow));
		}
		return null;
	}
}
