package JUnit.Junit09_Geometria;

import JUnit.Junit09_Geometria.dto.Geometria;

public class App 
{
    public static void main( String[] args )
    {
	   //Creacion de Objeto Circulo
    	
	   Geometria geo=new Geometria(2);
	   double areaCirc= geo.areaCirculo(2);
	   geo.setArea(areaCirc);    

    }
    
}
