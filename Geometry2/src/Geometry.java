


public class Geometry 
{
public static double sphereVolume (double r)
{
double sphereVolume = (4.0/ 3.0) * Math.PI * (Math.pow(r,3));
return sphereVolume;
}

public static double sphereSurface (double r)
{
double sphereSurfaceArea = 4.0 * Math.PI * (Math.pow(r, 2));
return sphereSurfaceArea;
}

public static double cylinderVolume(double r, double h)
{
double CylinderVolume = Math.PI * (Math.pow(r,2)) * h;
return CylinderVolume;
}

public static double cylinderSurface (double r, double h)
{
double CylinderSurfaceArea = 2 * (Math.PI * (Math.pow(r,2))) + (2 + Math.PI * r) * h;
return CylinderSurfaceArea;
}

public static double coneVolume (double r, double h)
{
double coneVolume = 1.0/3.0 * Math.PI * (Math.pow(r,2)) * h;
return coneVolume;
}
public static double coneSurface (double r, double h)
{
double coneSurfaceArea =  Math.PI * r * Math.sqrt(Math.pow(r,2) + Math.pow(h, 2)) + Math.PI * Math.pow(r,2);
return coneSurfaceArea;
}
}

